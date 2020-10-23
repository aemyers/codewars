package kata_54b724efac3d5402db00065e;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MorseCodeDecoder {

	private static final String CODE = "[.-]+";
	private static final String WORD = "   ";

	public static String decode(final String morseCode) {
		String e = String.format("(%s)|(%s)", CODE, WORD);
		Pattern p = Pattern.compile(e);
		Matcher matcher = p.matcher(morseCode.trim());

		StringBuilder sb = new StringBuilder();
		while (matcher.find()) {
			final String code = matcher.group();

			if (code.equals(MorseCodeDecoder.WORD)) {
				sb.append(' ');
				continue;
			}

			String translated = MorseCode.get(code);
			sb.append(translated);
		}

		return sb.toString();
	}

}
