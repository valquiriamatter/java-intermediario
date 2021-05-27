public class ClasseExterna2 {

    public void metodoQualquer(){

        class ClasseLocal{

            private String texto = "texto classe local";

            public void imprimeTexto(){
                System.out.println(texto);
            }
        }

        ClasseLocal local = new ClasseLocal();

        local.imprimeTexto();
    }

    public static void main(String[] args){

        ClasseExterna2 externa = new ClasseExterna2();

        externa.metodoQualquer();
    }
}