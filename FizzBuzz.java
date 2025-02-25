import java.util.Scanner;
public class FizzBuzz {
    
    public static void main (String[] args) {
        //Primero, declaro todas las variables:
        Scanner lector = new Scanner(System.in);
        int nveces, numero;
        int i = 0; //Esto es para el contador del ciclo while
        
        //Ahora, pediremos al usuario cuántas veces quiere que se le pregunten números, y agregaremos un ciclo while para que solo se puedan ingresar numeros enteros positivos
       System.out.print ("Ingrese la cantidad de veces que desea ingresar numeros: ");
       nveces = lector.nextInt();
       while (nveces <= 0) { //Mientras nveces sea menor o igual a cero, marcará error y pedira denuevo el numero
           System.out.print ("ERROR. Ingrese un numero de veces valido (numeros enteros positivos).");
           System.out.print ("\nIngrese la cantidad de veces que desea ingresar numeros: ");
           nveces = lector.nextInt();
       }
       
       //Pasamos a hacer un ciclo while en el que se verifique que los numeros ingresados sean mayores a cero medainte un ciclo do-while
       while (i < nveces) { //Mientras i sea menor a n veces repetir el ciclo
           do { //Hacer lo siguiente:
               System.out.print ("\nIngrese un numero: ");
               numero = lector.nextInt();
               if (numero < 0) { //Si numero es menor a cero, marque error y vuelvalo a pedir
               System.out.println ("ERROR. Ingrese un numero valido (numero enteros positivos).");
               }
           } while (numero < 0); //Repetir esto hasta que numero sea un entero positivo

           //Dentro de este otro ciclo while verificamos si el número ingresado es múltiplo de 3, 5 o ambos
           if (numero % 5 == 0 && numero % 3 == 0) { //Si el número es múltiplo de 5 y de 3, entonces imprima FizzBuzz
               System.out.printf ("%d= FizzBuzz", numero);
           }
           else if (numero % 5 == 0) { //Pero si el número es únicamente múltiplo de 5, entonces imprima Fizz
               System.out.printf ("%d= Fizz", numero);
           }
           else if (numero % 3 == 0) { //Pero si el número es únicamente múltiplo de 3, entonces imprima Buzz
               System.out.printf ("%d= Buzz", numero);
           }
           else { //Y si no es nada de lo anterior, imprima Nothing
               System.out.printf ("%d is Nothing", numero);
           }
           i++; //Con este i++ hacemos que el ciclo se repita las veces que el usuario lo pidió, ya que esa cantidad de veces la guardamos en una variable llamada nveces y en el ciclo pusimos la condicion de que este se repita mintras que i sea menor a nveces
        //En el if y else if puse que "%d" tomara el valor del numero que el usuario anteriormente ingresó para que se vuelva a imprimir. Haciendo así que se muestre en pantalla que el número es Fizz, Buzz o FizzBuzz
       }
    }
}
