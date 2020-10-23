package kata_54b72c16cd7f5154e9000457;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MorseCodeDecoder {

	private static final String CODE = "[.-]+";
	private static final String WORD = "   ";

	private enum SignalType {

		TRANSMIT, PAUSE;

		private static SignalType of(final String signal) {
			if (signal.charAt(0) == '1') {
				return TRANSMIT;
			} else {
				return PAUSE;
			}
		}

	}

	private enum SignalMeaning {

		    SHORT(SignalType.TRANSMIT, 1, "."),
		     LONG(SignalType.TRANSMIT, 3, "-"),
		DELIMITER(SignalType.PAUSE,    1, null),
		CHARACTER(SignalType.PAUSE,    3, " "),
		     WORD(SignalType.PAUSE,    7, "   ");

		private final SignalType signal;
		private final int units;
		private final String representation;

		private SignalMeaning(final SignalType signal, final int units, final String representation) {
			this.signal = signal;
			this.units = units;
			this.representation = representation;
		}

		private void append(final StringBuilder builder) {
			if (this.representation == null) return;
			builder.append(this.representation);
		}

		private static SignalMeaning of(final SignalType signal, final int units) {
			for (final SignalMeaning m : SignalMeaning.values()) {
				if (m.signal == signal && m.units == units) {
					return m;
				}
			}

			throw new IllegalArgumentException("not found");
		}

	}

	public static String decodeBits(final String bits) {
		final String trimmed = bits.replaceAll("^0+|0+$", "");       // drop leading and trailing zeros
		final String[] signals = trimmed.split("(?<=(\\d))(?!\\1)"); // split on change of character
		final int unit = MorseCodeDecoder.shortest(signals);

		final StringBuilder message = new StringBuilder();
		for (final String signal : signals) {
			final SignalType type = SignalType.of(signal);
			final int units = signal.length() / unit;
			final SignalMeaning meaning = SignalMeaning.of(type, units);
			meaning.append(message);
		}

		return message.toString();
	}

	private static int shortest(final String[] transmits) {
		int result = transmits[0].length();

		for (final String transmit : transmits) {
			if (transmit.length() < result) {
				result = transmit.length();
			}
		}

		return result;
	}

	public static String decodeMorse(final String morseCode) {
		final String e = String.format("(%s)|(%s)", MorseCodeDecoder.CODE, MorseCodeDecoder.WORD);
		final Pattern p = Pattern.compile(e);
		final Matcher matcher = p.matcher(morseCode.trim());

		final StringBuilder result = new StringBuilder();
		while (matcher.find()) {

			final String code = matcher.group();

			if (code.equals(MorseCodeDecoder.WORD)) {
				result.append(' ');
				continue;
			}

			final String translated = MorseCode.get(code);
			result.append(translated);

		}

		return result.toString();
	}

}
