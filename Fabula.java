package fabula;
import java.util.Scanner;
public class Fabula {
	
	public static void main (String [] args)
	{
		int avancet, avancel, pasostotales, pasost, pasosl, distancia;
		Scanner lector = new Scanner(System.in);
		
		distancia = 10;
		avancet = 0;
		avancel = 0;
		
		//Ahora, pediremos al usuario los pasos dados por la tortuga y por la liebre en cada iteración,
		//mientras ninguno de los dos hayan llegado aún
		
		//mientras el avancet sea menor a la distancia y además el avancel sea menor a la distancia, hacer lo siguiente
		while (avancet < distancia && avancel < distancia) {
			
			//pedir pasos de la tortuga:
			System.out.println("\nIngrese el número de pasos que avanza la tortuga");
			pasost = lector.nextInt();
		
			//pedir pasos de la liebre:
			System.out.println("\nIngrese el número de pasos que avanza la liebre");
			pasosl = lector.nextInt();
		
			//sumar pasos de la tortuga:
			avancet = avancet + pasost;
		
			//sumar pasos de la liebre:
			avancel = avancel + pasosl;
		
			//mostrar información:
			System.out.printf("La Tortuga ha avanzado %d y la liebre ha avanzado %d", avancet, avancel);
		}
		
		if (avancel > avancet) {
			System.out.println ("\nGanó la Liebre");
		}
		else {
			if (avancel < avancet) {
				System.out.println ("\nGanó la Tortuga");
			}
			else {
				System.out.println ("\nHubo un empate");
			}
		}
	}
}
