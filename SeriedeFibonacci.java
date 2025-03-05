import java.util.Scanner;

public class SeriedeFibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de términos de la serie de Fibonacci: ");
        int n = scanner.nextInt();

        //Validar que n sea un número positivo
        while (n <= 0) {
            System.out.println("ERROR. Debe ingresar un número positivo.");
            System.out.print("Ingrese el número de términos de la serie de Fibonacci: ");
            n = scanner.nextInt();
        }

        //Crear un arreglo para almacenar los términos de la serie
        int [] fibonacci = new int[n];

        //Inicializar los dos primeros términos de la serie
        if (n >= 1) {
            fibonacci[0] = 1;
        }
        if (n >= 2) {
            fibonacci[1] = 1;
        }

        //Calcular los términos restantes de la serie
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        //Mostrar en pantalla las serie de Fibonacci
        System.out.println("Serie de Fibonacci con " + n + " términos:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }
}