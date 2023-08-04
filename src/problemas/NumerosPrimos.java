package problemas;

public class NumerosPrimos {
    public static void main(String[] args){
        System.out.println(esPrimo(5)); // true
        System.out.println(esPrimo(8)); // false
        System.out.println(esPrimo(545600)); // false
        System.out.println(esPrimo(19)); // true
    }
    
    public static boolean esPrimo(int numero){ // 
        int cuentaDivisores = 0;
        for (int i = 2; i < numero; i++) { //
            if(numero % i == 0){ // 
                cuentaDivisores = cuentaDivisores + 1; // 
                break;
            }
        }
        if(cuentaDivisores == 0){
            return true;
        }else{
            return false;
        }   
    }
    
}
