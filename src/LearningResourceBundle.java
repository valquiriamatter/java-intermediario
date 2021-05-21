import java.util.Locale;
import java.util.ResourceBundle;

public class LearningResourceBundle {

        public static void main(String[] args) {

            System.out.println("Locale atual " + Locale.getDefault()); //pra pegar o locale atual
            Locale.setDefault(new Locale("en", "us")); // pra setar o locale

            ResourceBundle rb = ResourceBundle.getBundle("meu-texto"); //arquivo do resource boundle

            System.out.println("Hello EN: " + rb.getString("hello"));
            System.out.println("World EN: " + rb.getString("world"));

            rb = ResourceBundle.getBundle("meu-texto"); //arquivo do resource boundle

            //Locale.setDefault(new Locale("pt_BR", "pt_BR"));
            rb = ResourceBundle.getBundle("meu-texto", new Locale("pt_BR", "pt_BR"));

            System.out.println("Olá pt_BR: " + rb.getString("hello"));
            System.out.println("Mundo pt_BR: " + rb.getString("world"));
        }

    }

