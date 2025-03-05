public class NumeroPerdido {

    public static void main(String[] args) {
        //Declarar arreglo de Enteros:
        int [] enteros = {1,2,3,4,5,6,8,9};

        //Encotrar el número que falta
        for (int i = 0 ; i < enteros.length ; i++) {
            if (enteros[i] != i + 1) {
                System.out.print("El número que falta es: " + (i + 1));
                break;
            }
        }
    }
}