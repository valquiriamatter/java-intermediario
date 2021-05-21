public class Matematica {

    enum Operacao {
        SOMAR("+") {
            @Override
            public double executarOperacao(double x, double y) {
                return x+y;
            }
        }, SUBTRAIR("-") {
            @Override
            public double executarOperacao(double x, double y) {
                return x-y;
            }
        }, MULTIFLICAR("*") {
            @Override
            public double executarOperacao(double x, double y) {
                return x*y;
            }
        }, DIVIDIR("/") {
            @Override
            public double executarOperacao(double x, double y) {
                return x/y;
            }
        };

        private String simbolo;

        Operacao(String simbolo) {
            this.simbolo = simbolo;
        }

        @Override
        public String toString() {
            return simbolo;
        }

        public abstract double executarOperacao(double x, double y);

    }

    public static void main(String[] args) {

        double x = 2.0;
        double y = 3.0;

        for (Operacao op : Operacao.values()){
            System.out.print("x" + " ");
            System.out.println(op.toString() + " ");
            System.out.print("y" + " ");

            System.out.println(op.executarOperacao(x,y));
        }


    }








}
