import java.util.Random;

public class LearningRandom {
    public static void main(String[] args) {

        System.out.println(Math.random());
        System.out.println(Math.floor(Math.random() * 10)); //até 10
        System.out.println(Math.floor(Math.random() * 100)); // até 100

        //Entre 1 e 5 é melhor com a classe Random

        Random aleatorio = new Random();
        System.out.println(aleatorio.nextInt());

        //até 100
        System.out.println(aleatorio.nextInt(100)); // se quiser que pegue o 100 coloque 101 (n+1)

    }
}
