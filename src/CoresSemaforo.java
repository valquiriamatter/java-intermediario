public enum CoresSemaforo {

    VERDE(1000), AMARELO(300), VERMELHO(2000);

    public int getTempoEspera() {
        return tempoEspera;
    }

    private int tempoEspera;

    CoresSemaforo(int tempoEspera){
        this.tempoEspera = tempoEspera;
    }


}
