public class Ejercicio5 {

    public static void main(String[] args) {

        //datos
        int[] a = {714, 81, 9, 11};
        int[] b = {42, 13, 12345, 4};
        int[] c = {6, 66, 666};

        //proceso
        System.out.println(ocurrencias(8, 4672));
        System.out.println(ocurrencias(5, 25153));
        System.out.println(ocurrencias(2, 123456));

        System.out.println(ocurrencias(1, a));
        System.out.println(ocurrencias(4, b));
        System.out.println(ocurrencias(6, c));
    }

    public static int ocurrencias(int digito, int n) {

        //datos
        int cantidad = 0;
        int cifra;

        //proceso
        while (n > 0) {

            cifra = n % 10;

            if (cifra == digito) {
                cantidad = cantidad + 1;
            }

            n = n / 10;
        }

        return cantidad;
    }

    public static int ocurrencias(int digito, int[] a) {

        //datos
        int cantidad = 0;

        //proceso
        for (int i = 0; i < a.length; i++) {
            cantidad = cantidad + ocurrencias(digito, a[i]);
        }

        return cantidad;
    }
}