public class Algoritmos {

    public static boolean esPar(int numero1) {
        if (numero1 % 2 == 0) {

            return true;
        } else {
            return false;
        }

    }

    public static boolean esPrimo(int numero2) {
        if ((numero2 % 1 == 0) && (numero2 % numero2 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static String stringEnReversa(String str1) {
        //
        String reversa = "";

        System.out.println(str1);

        for (int i = str1.length() - 1; i >= 0; i--) {
            reversa += str1.charAt(i);
            System.out.print(str1.charAt(i));
        }
        return reversa;
    }


    public static boolean esPalidromo(String palabra){
    boolean resultado = true;

    int tamaño = palabra.length();

    for(int i=0; i<tamaño /2; i++){

      if (palabra.charAt(i) !=palabra.charAt(tamaño-i -1)) {
       
        resultado = false;
       break; 
      }

    }
    return resultado;    
        
    }
    public static void secuenciaFizzBuzz(int secuencia){
        for(int i = 1; i <= secuencia; i++){
            if(i% 3 == 0 && i% 5 == 0){
                System.out.println("FizzBuzz");
            }else if(i% 3 == 0){
                System.out.println("Fizz");
            }else if(i% 5 == 0){
                System.out.println("Buzz");
            }else{
                System.out.println(i + " ");
            }
        }
    }
} 

   