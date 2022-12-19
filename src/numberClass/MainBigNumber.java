package numberClass;

import java.math.BigDecimal;

public class MainBigNumber {
    public static void main(String[] args) {
        BigDecimal number1 = new BigDecimal("12000000000.00");
        System.out.println("Number 1 "+ number1);
        BigDecimal number2 = new BigDecimal("14000000000.00");
        System.out.println("\nNumber 2 "+ number2);
        BigDecimal number3 = number1.add(number2);
        System.out.println("\nAdd : "+ number3);
        System.out.println("\nMultiple : "+ number1.multiply(new BigDecimal(3)));
        System.out.println("\nSubtract : "+ number2.subtract(number1));
        System.out.println("\ndivide : "+ number2.divide(new BigDecimal(5)));

        Double doubleValue = number1.doubleValue();
        System.out.println("\nDouble value "+ doubleValue);
    }
}


