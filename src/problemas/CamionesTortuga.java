package problemas;

public class CamionesTortuga {

    public static void main(String[] args) {
        muestraCamiones();
    }

    public static void muestraCamiones() {
        for (int i = 1; i < 500; i++) {
            if (verificaCondicionFlota(i) == true) {
                muestraCamionDeFlota(i);
            }
        }
    }

    public static void muestraCamionDeFlota(int numero) { // 25
        System.out.println(numero + " -> " + cuadrado(numero));
    }

    public static boolean verificaCondicionFlota(int numero) {
        int numeroCamion = numero;
        int cuadradoCamion = cuadrado(numeroCamion);
        // 25                    625                           10^2                              
        if (numeroCamion == (cuadradoCamion % (int) (Math.pow(10, cuentaDigitos(numeroCamion))))) {
            return true;
        }
        return false;
    }

    // cuentaDigitos(25) = 2
    // String nombre = "Devid"
    // nombre = "David";
    public static int cuentaDigitos(int numero) { // 625
        int cuenta = 0;
        while (numero != 0) { // 625 62 2 0
            numero = numero / 10; // 62 6 0
            cuenta = cuenta + 1; // 1 2 3
        }
        return cuenta;
    }

    public static int cuadrado(int numero) { // 5 -> 2 
        int cuadradoNumero = numero * numero;
        return cuadradoNumero;
    }

}
