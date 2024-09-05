public class DataTypesAndVariables {
  public static void main(String[] args) {
    byte byteNum = 127;
    short shortNum = 32767;
    int intNum = 2147483647;
    long longNum = Long.MAX_VALUE;
    float floatMax = Float.MAX_VALUE;
    double doubleMax = Double.MAX_VALUE;
    boolean bool = true;
    char chr = 'A';
    String author = "ArielT";

    System.out.println("");
    System.out.println("PRIMITIVE DATA TYPES");
    System.out.println("byte");
    System.out.println("short");
    System.out.println("int");
    System.out.println("long");
    System.out.println("float");
    System.out.println("double");
    System.out.println("boolean");
    System.out.println("char");
    System.out.println();

    System.out.println("Byte: " + byteNum);
    System.out.println("Short: " + shortNum);
    System.out.println("Int: " + intNum);
    System.out.println("Long: " + longNum);
    System.out.println("Float: " + floatMax);
    System.out.println("Double: " + doubleMax);
    System.out.println("Boolean: " + bool);
    System.out.println("Char: " + chr);
    System.out.println("String: " + author);
    System.out.println();

    // Another way to output using Print Format
    System.out.printf("Byte: %d\nShort: %d\nInt: %d\nLong: %d\nFloat: %.2f\nDouble: %.2f\nBool: %b\nChar: %c\nString: %s\n",
        byteNum, shortNum, intNum, longNum, floatMax, doubleMax, bool, chr, author);
  }
}