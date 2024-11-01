public class Aplicacion {

    public static void main(String[] args) {

        int num1 = 5;
        System.out.println(Algoritmos.esPar(num1));

        int num2 = 7;

        System.out.println(Algoritmos.esPrimo(num2));

        System.out.println(Algoritmos.stringEnReversa("hola mundo"));

        System.out.println(Algoritmos.esPalidromo ("reconocer"));
        
      System.out.println("la secuencia");
        Algoritmos.secuenciaFizzBuzz(20);
    }

}
