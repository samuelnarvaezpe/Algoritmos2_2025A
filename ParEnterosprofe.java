//EJERCICIO 3: PAR DE ENTEROS CON EL MAYOR PRODUCTO
//dado un arreglo de enteros, encontrar el par cuyo producto sea mayor.
//En este caso, el 8 y el 6
public class ParEnterosprofe {
    public static void main(String[] args) {
        int [] enteros = {4,5,8,1,6,3,2,1};
        int x=0, y=0;

        //primer ciclo para obtener el mayor absoluto:
        for(int i = 0; i < enteros.length; i++){
            if (enteros[i] > x)
                x = enteros[i];
        }

        //segundo ciclo para obtener el que le sigue:
        for(int i = 0; i < enteros.length; i++){
            if (enteros[i] > y && enteros[i] < x)
                y = enteros[i];
        }
        System.out.printf("\nMayor producto es %d, de %d y %d", x*y,x,y);
    }
}
