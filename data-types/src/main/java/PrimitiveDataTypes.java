public class PrimitiveDataTypes {
    public static void main(String[] args) {

        byte byteValue = 127; //-128 to 127 - Size 1 byte
        short shortValue = 32_767; //-32768 to 32767 - Size 2 bytes
        int intValue = 2_147_483_647; //-2_147_483_648 to 2_147_483_647 - Size 4 bytes
        long longValue = 9_223_372_036_854_775_807l; //-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 - Size 8 bytes
        float floatValue = 4.1234567f; //Sufficient for storing 6 to 7 decimal digits - Size 4 bytes
        double doubleValue = 4.123456789012345; //Sufficient for storing 15 decimal digits - Size 8 bytes
        boolean booleanValue = true; //true or false values - Size 1 byte
        char charValue = 'a'; //Single character/letter or ASCII values - Size 2 bytes
        char anotherCharValue = 65; //ASCII code value

        System.out.println("byte -> " + byteValue);
        System.out.println("short -> " + shortValue);
        System.out.println("int -> " + intValue);
        System.out.println("long -> " + longValue);
        System.out.println("float -> " + floatValue);
        System.out.println("double -> " + doubleValue);
        System.out.println("boolean -> " + booleanValue);
        System.out.println("char -> " + charValue);
        System.out.println("anotherChar -> " + anotherCharValue);

    }
}
