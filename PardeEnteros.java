public class PardeEnteros {

    public static void main(String[] args) {
        int [] enteros = {4,5,8,1,2,6,9,3,7};
        int x=0, y=0;
        //Primer ciclo para tener el mayor absoluto del arreglo
        for (int i = 0; i < enteros.length; i++) {
            if (enteros[i] > x)
                x = enteros[i];
        }
        //Segundo ciclo para encontrar el segundo mayor absoluto del arreglo
        for (int i = 0; i < enteros.length; i++) {
            if (enteros[i] > y && enteros[i] < x)
                y = enteros[i];
        }
        System.out.printf("El mayor producto es %d, de los números %d y %d", x*y, x, y);
    }
}
