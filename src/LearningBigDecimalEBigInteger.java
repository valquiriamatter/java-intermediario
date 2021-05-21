import java.math.BigDecimal;
import java.math.BigInteger;

public class LearningBigDecimalEBigInteger {

    public static void main(String[] args) {


        double a = 0.03;
        double b = 0.04;
        double c = b-a;
        System.out.println(c); //não tem precisão

        BigDecimal _a = new BigDecimal("0.03");
        BigDecimal _b = new BigDecimal("0.04");
        BigDecimal _c = _b.subtract(_a);
        System.out.println(_c); //resultado preciso

        BigDecimal bd1 = new BigDecimal(1234567890.0987654321);
        BigDecimal bd2 = new BigDecimal(987654321.01234567890);
        System.out.println(bd1.add(bd2));
        System.out.println(bd1.multiply(bd2));
        System.out.println(bd1.divide(new BigDecimal(2)));

        BigInteger bi = new BigInteger("1000000000000000000");
        System.out.println(bi);


    }
}
