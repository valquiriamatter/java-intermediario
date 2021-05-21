import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class LearningDecimalFormat {

    public static void main(String[] args) {

        String padrao = "###,###.##";
        DecimalFormat df = new DecimalFormat(padrao);

        System.out.println(df.format(1234567543.321));

        DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("pt", "Brazil"));
        dfs.setDecimalSeparator(',');
        dfs.setGroupingSeparator('.');

        String padrao2 = "###,###.##";
        df = new DecimalFormat(padrao2, dfs);
        System.out.println(df.format(1234211212121.345));

        String padrao3 = "###,###,###.##";
        df = new DecimalFormat(padrao3, dfs);
        df.setGroupingSize(4); // para agrupar de 4 em 4 números
        System.out.println(df.format(1234567890.123));

        String padrao4 = "\u00A4###,###,000.00%"; //se colocar 0 ele preenche o que faltar
        df = new DecimalFormat(padrao4, dfs);
        System.out.println(df.format(0.1));

    }



}
