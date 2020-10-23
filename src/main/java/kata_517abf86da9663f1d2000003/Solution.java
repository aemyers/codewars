package kata_517abf86da9663f1d2000003;

class Solution{

  static String toCamelCase(final String s){
    final StringBuilder result = new StringBuilder();

    // simple state flag applied only to char that follows identifier
    boolean capitalize = false;

    for (final char c : s.toCharArray()) {

      if (c == '-' || c == '_') {
        capitalize = true;
        continue;
      }

      char r = c;
      if (capitalize) {
        r = Character.toUpperCase(r);
        capitalize = false;
      }

      result.append(r);

    }

    return result.toString();
  }

}
