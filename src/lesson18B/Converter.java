package lesson18B;

public class Converter {
    public static void main(String[] args) {
        System.out.println(intToString(11123232));
        System.out.println(intToString(0));
        System.out.println(intToString(-15));

        System.out.println(stringToInt("11"));
        System.out.println(stringToInt(null));
        System.out.println(stringToInt("11a"));
        System.out.println(stringToInt("aaaaa"));
    }

    public static String intToString(int input) {
        return String.valueOf(input);
    }

    public static int stringToInt(String input) {
        try {
            return Integer.parseInt(input);
        } catch (Exception e) {
            System.out.println(input + " can not be converted to int");
            return 0;
        }
    }
}
