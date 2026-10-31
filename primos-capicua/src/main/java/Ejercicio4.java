import java.util.Random;

public class Ejercicio4 {

    public static void main(String[] args) {

        //datos
        int[] numeros = new int[10];
        Random rnd = new Random();

        //proceso
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rnd.nextInt(99) + 2;
        }

        //salida
        System.out.println("Array generado:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < numeros.length; i++) {

            System.out.print("El " + numeros[i]);

            if (esPrimo(numeros[i])) {
                System.out.print(" es primo");
            } else {
                System.out.print(" no es primo");
            }

            if (esCapicua(numeros[i])) {
                System.out.println(" y es capicúa.");
            } else {
                System.out.println(" y no es capicúa.");
            }
        }
    }

    public static boolean esPrimo(int numero) {

        //datos
        int divisores = 0;

        //proceso
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                divisores = divisores + 1;
            }
        }

        return divisores == 2;
    }

    public static boolean esCapicua(int numero) {

        //datos
        int original = numero;
        int alReves = 0;
        int cifra;

        //proceso
        while (numero > 0) {
            cifra = numero % 10;
            alReves = alReves * 10 + cifra;
            numero = numero / 10;
        }

        return original == alReves;
    }
}