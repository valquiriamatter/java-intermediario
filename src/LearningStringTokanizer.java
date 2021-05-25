import java.util.StringTokenizer;

public class LearningStringTokanizer {

    public static void main(String[] args) {

        String doArquivo = "1;Antônio;30;";

        StringTokenizer st = new StringTokenizer(doArquivo, ";");

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
