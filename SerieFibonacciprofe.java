import java.util.Scanner;

public class SerieFibonacciprofe {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int n;
        System.out.println("Ingrese el número de términos: ");
        n = lector.nextInt();

        //declaro arreglo con n términos:
        int[] fibo = new int[n];
        fibo[0] = 1;
        fibo[1] = 1;
        System.out.print("\n1,1,");

        for (int i = 2; i < fibo.length; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
            System.out.printf("%d,", fibo[i]);
        }
    }
}
