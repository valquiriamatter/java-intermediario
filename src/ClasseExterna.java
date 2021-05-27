public class ClasseExterna {

    private String texto = "texto externo";

    public class Interna{

        private String texto = "texto interno";

        public void imprimeTexto(){
            System.out.println(texto);

            //consegue ver membros da classe externa
            System.out.println(ClasseExterna.this.texto);
        }
    }

    public static void main(String[] args){

        ClasseExterna externa = new ClasseExterna();
        Interna interna = externa.new Interna();

        interna.imprimeTexto();
    }
}