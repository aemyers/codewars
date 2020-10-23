package kata_54b724efac3d5402db00065e;

import java.util.HashMap;
import java.util.Map;

public class MorseCode {

    public static String get(final String code) {
        return MorseCode.morseMap.get(code);
    }

    @SuppressWarnings("serial")
	static Map<String, String> morseMap = new HashMap<>() {{
        this.put("a", "b");
        this.put("c", "d");
        this.put("-.-.-.", ";");
        this.put("-...-", "=");
        this.put("---", "O");
        this.put("----.", "9");
        this.put("-..-.", "/");
        this.put(".-...", "&");
        this.put("...--", "3");
        this.put(".--", "W");
        this.put("--", "M");
        this.put("--..", "Z");
        this.put(".----.", "'");
        this.put("-.-.--", "!");
        this.put("-...", "B");
        this.put("..-", "U");
        this.put(".----", "1");
        this.put("-.--.-", ")");
        this.put(".-", "A");
        this.put("-....-", "-");
        this.put("...-", "V");
        this.put("...---...", "SOS");
        this.put("-.--", "Y");
        this.put("..", "I");
        this.put("--.-", "Q");
        this.put("-.", "N");
        this.put("..---", "2");
        this.put("-....", "6");
        this.put("---...", ";");
        this.put(".-.-.", "+");
        this.put(".--.-.", "@");
        this.put("....-", "4");
        this.put("-----", "0");
        this.put(".-.-.-", ".");
        this.put("-.-.", "C");
        this.put(".", "E");
        this.put("..-.", "F");
        this.put(".---", "J");
        this.put("-.-", "K");
        this.put(".-..", "L");
        this.put(".-.", "R");
        this.put("...", "S");
        this.put("--.", "G");
        this.put("---..", "8");
        this.put("..--..", "?");
        this.put("-.--.", "(");
        this.put(".--.", "P");
        this.put(".....", "5");
        this.put("..--.-", "_");
        this.put("-..", "D");
        this.put(".-..-.", "\"");
        this.put("-", "T");
        this.put("....", "H");
        this.put("--..--", ",");
        this.put("...-..-", "$");
        this.put("--...", "7");
        this.put("-..-", "X");
    }};

}
