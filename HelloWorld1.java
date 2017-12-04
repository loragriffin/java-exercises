public class HelloWorld1
{
  static String helloWorld = "Hello World!";

  public static void main(String[] args)
  {
    System.out.println(helloWorld);

    // Different variable types
    byte bigByte = 127;
    short bigShort = 32767;
    int bigInt = 2100000000;
    long bigLong = 9220000000000000000L;
    float bigFloat = 3.14F;
    double bigDouble = 3.141529;

    System.out.println(Float.MAX_VALUE);
    System.out.println(Double.MAX_VALUE);

    boolean trueOrFalse = true;
    char randomChar = 65;
    char anotherChar = 'A';

    String randomString = "I'm a random string";
    String anothersString = "Stuff";

    String combinedString = randomString + ' ' + anothersString;

    // Converting into other data types
    String byteString = Byte.toString(bigByte);
    String shortString = Short.toString(bigShort);
    String intString = Int.toString(bigInt);
    String longString = Long.toString(bigLong);
    String floatString = Float.toString(bigFloat);
    String doubleString = Double.toString(bigDouble);
    String booleanString = Boolean.toString(trueOrFalse);

    double aDoubleValue = 3.1415;
    int doubleToInt = (int) aDoubleValue;

    int stringToInt = Integer.parseInt(intString);

  }
}
