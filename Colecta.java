import java.util.Scanner;
public class Colecta {

    public static void main (String[] args) {
        int tope, recolectado, npersonas, aportepersonas;
        Scanner lector = new Scanner(System.in);
        tope = 100000;
        recolectado = 0;

        System.out.println("Ingrese la cantidad de personas que desean aportar: ");
        npersonas = lector.nextInt();

        for (int i = 0; i < npersonas && recolectado < tope; i++) {
            System.out.printf("\nCuánto va a aportar la persona %d: ", i + 1);
            aportepersonas = lector.nextInt();
            recolectado = recolectado + aportepersonas;
           /*
            System.out.printf("\nLo recolectado hasta el momento es: %d", recolectado);

            if (recolectado >= tope) {
                break;
            }
            */
        }
    }
}
