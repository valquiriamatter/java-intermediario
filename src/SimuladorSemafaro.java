public class SimuladorSemafaro {

    public static void main(String[] args) {

        ThreadSemaforo semaforo = new ThreadSemaforo();

        for (int i = 0; i <= 10; i++) {
            System.out.println(semaforo.getCor());
            semaforo.esperaCorMudar();

        }
        semaforo.desligarSemafaro();
    }

}
