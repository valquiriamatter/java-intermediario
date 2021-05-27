public class ClasseAnonima {

    public void imprimeTexto(){
        System.out.println("qualquer texto");
    }

    public static void main(String[] args){

        ClasseAnonima anonima = new ClasseAnonima(){
            public void imprimeTexto(){
                System.out.println("qualquer texto que foi sobrescrito");
            }
        };

        anonima.imprimeTexto();

        //usando interface
        Texto texto = new Texto() {
            @Override
            public void imprimeTexto() {
                System.out.println("qualquer texto - interface");
            }
        };

        texto.imprimeTexto();
    }


}


