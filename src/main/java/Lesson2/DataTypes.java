package Lesson2;

public class DataTypes {
    boolean result = true;
    char capitalC = 'C';
    byte b = 100;
    short s = 10000;
    int i = 100000;
    long creditCardNumber = 1234_5678_9012_3456L;
    float pi = 3.14_15F;
    double d1 = 123.4;

    public static void main(String[] args) {
        // 1 + 2 equals 12? Whaaaaaaaaaaaaat??!?!?!?
        String x = "1";
        String y = "2";
        System.out.println(x + y);  // not what you expect;
        int i = Integer.parseInt(x);
        int j = Integer.parseInt(y);

        System.out.println(i + j);

        // What about booleans?
        String areYouHappy = "true";
        boolean ishappy = Boolean.parseBoolean(areYouHappy);
        System.out.println(ishappy);

        // Or String to double?
        String gpa = "3.96";
        Double realgpa = Double.parseDouble(gpa);
        System.out.println(realgpa - 1.0);
    }
}
