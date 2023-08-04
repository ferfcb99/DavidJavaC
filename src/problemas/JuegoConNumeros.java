package problemas;

public class JuegoConNumeros {
    public static void main(String[] args) {
        imprimeFila(5);
  
    }
    
    
    public static void imprimeFila(int numero){// 3
        //                  N =       3        |            111                *                 111
        System.out.println("N = " + numero + " | " + convierteUnos(numero) + " * " + convierteUnos(numero) + " = " +
        //                 111           ,     111
        multiplica(convierteUnos(numero), convierteUnos(numero)));
    }
    
    public static int convierteUnos(int numero){ // 5
        int unos = 0;
        while(numero > 0){ // 5 > 0 , 4 > 0 , 3 > 0 , 2 > 0, 1 > 0, 0 > 0
            unos = unos * 10 + 1; // 0*10+1= 1 -> 1*10+1 = 11 -> 11*10+1= 111 -> 111*10+1 = 1111 -> 1111*10+1=11111
            numero = numero - 1; // 4 3 2 1 0
        }
        return unos;
    }

    public static int multiplica(int a, int b){
        return a*b;
    }
    
    
}
