public class LearnigString {

    public static void main(String[] args) {

        String teste = "isso é um teste";

        String testeMinusc = teste.toLowerCase(); //tudo minusculo
        String testeMaisc = teste.toUpperCase(); //tudo maiusculo

        System.out.println(testeMinusc);
        System.out.println(testeMaisc);

        System.out.println(teste);
        System.out.println(teste.substring(10)); //começa a imprimir no índice 10
        System.out.println(teste.substring(10, 15)); //imprime do indice 10 ao 15

        String ola = "olá";
        String mundo = " mundo";
        String olaMundo = ola.concat(mundo); //ola + mundo
        System.out.println(olaMundo);

        String espacos = "i s p a ç o";
        String semEspacos = espacos.replace('i', 'e');
        System.out.println(semEspacos);

        semEspacos = semEspacos.replaceAll(" ", "");
        System.out.println(semEspacos);

        String nome = " meu nome é: ";
        System.out.println(nome);
        System.out.println(nome.trim());

        String banana = "banana";
        String ana = "ana";

        System.out.println(banana.indexOf('x'));
        System.out.println(banana.indexOf('b'));
        System.out.println(banana.indexOf('a'));

        System.out.println(banana.indexOf(ana));

        System.out.println(banana.lastIndexOf('a'));
        System.out.println(banana.lastIndexOf(ana));

        System.out.println(banana.contains(ana));
        System.out.println(banana.contains("ceu"));


    }



}
