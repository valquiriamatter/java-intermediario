public class TestaEnum {

    public static void main(String[] args) {

        DiaSemana dia1 = DiaSemana.SEGUNDA;

        System.out.println(dia1.toString() + " - " + dia1.getValor());

        System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO"));
        DiaSemana dia = Enum.valueOf(DiaSemana.class, "DOMINGO");

        System.out.println(dia);

        Data data = new Data(1, 4, 2016, DiaSemana.SEXTA);


        DiaSemana[] dias = DiaSemana.values();

        for (int i = 0; i < dias.length; i++) {
            System.out.println(dias[i]);
        }

        for (DiaSemana dia2 : DiaSemana.values()) {
            System.out.println(dia2);
        }


    }








}

