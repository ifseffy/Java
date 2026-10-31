import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //datos
        char letra;
        double radio;
        double altura;

        //entrada
        System.out.print("¿Qué quieres calcular? Escribe 'a' para área y 'v' para volumen: ");
        letra = entrada.next().charAt(0);

        System.out.print("Dime el radio: ");
        radio = entrada.nextDouble();

        System.out.print("Dime la altura: ");
        altura = entrada.nextDouble();

        //proceso
        calcularCilindro(letra, radio, altura);
    }

    public static void calcularCilindro(char letra, double radio, double altura) {

        if (letra == 'a') {
            System.out.println("Área: " +
                    2 * Math.PI * radio * (radio + altura));

        } else if (letra == 'v') {
            System.out.println("Volumen: " +
                    Math.PI * radio * radio * altura);

        } else {
            System.out.println("Opción incorrecta");
        }
    }
}