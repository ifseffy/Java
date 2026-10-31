public class Ejercicio3 {

    public static void main(String[] args) {

        //datos
        int[] numeros = {4, 7, 10, 11, 15, 17};
        int[] primos;

        //proceso
        primos = filtraPrimos(numeros);
        
        for (int i = 0; i < primos.length; i++) {
            System.out.println(primos[i]);
        }
    }

    public static int[] filtraPrimos(int x[]) {

        //datos
        int cantidad = 0;
        int divisores;
        int posicion = 0;

        //proceso
        for (int i = 0; i < x.length; i++) {

            divisores = 0;

            for (int j = 1; j <= x[i]; j++) {
                if (x[i] % j == 0) {
                    divisores = divisores + 1;
                }
            }

            if (divisores == 2) {
                cantidad = cantidad + 1;
            }
        }

        int[] primos = new int[cantidad];

        for (int i = 0; i < x.length; i++) {

            divisores = 0;

            for (int j = 1; j <= x[i]; j++) {
                if (x[i] % j == 0) {
                    divisores = divisores + 1;
                }
            }

            if (divisores == 2) {
                primos[posicion] = x[i];
                posicion = posicion + 1;
            }
        }

        return primos;
    }
}