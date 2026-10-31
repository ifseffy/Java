import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //datos
        int numero;
        boolean capicua;

        //entrada
        System.out.print("Introduce un número: ");
        numero = entrada.nextInt();

        //proceso
        capicua = esCapicua(numero);

        //salida
        System.out.println(capicua);
    }

    public static boolean esCapicua(int numero) {

        //datos
        int original;
        int alReves = 0;
        int cifra;

        //proceso
        original = numero;

        while (numero > 0) {

            cifra = numero % 10;
            alReves = alReves * 10 + cifra;
            numero = numero / 10;
        }

        return original == alReves;
    }
}