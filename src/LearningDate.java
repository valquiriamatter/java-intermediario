import java.util.Date;

public class LearningDate {

    public static void main(String[] args) {

        Date hoje = new Date();

        System.out.println(hoje);

        System.out.println("Milisegundos desde 1 Jan 1970 " + hoje.getTime());

        System.out.println(hoje.getDate());

    }

}
