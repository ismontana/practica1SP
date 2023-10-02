import java.util.Scanner;
public class practica2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("******************************************************");
        System.out.print("Introduce el tamaño de valores del arreglo: ");
        int tamaño = scanner.nextInt();
        System.out.println("******************************************************");

        int[] arreglo = new int[tamaño];

        System.out.println("Introduce los valores del arreglo (Solo valores enteros):");

        for (int i = 0; i < tamaño; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
        }

        int maximo = arreglo[0];
        for (int i = 1; i < tamaño; i++) {
            if (arreglo[i] > maximo) {
                maximo = arreglo[i];
            }
        }

        // b) El valor más pequeño en el arreglo
        int minimo = arreglo[0];
        for (int i = 1; i < tamaño; i++) {
            if (arreglo[i] < minimo) {
                minimo = arreglo[i];
            }
        }

        int impares = 0;
        for (int i = 0; i < tamaño; i++) {
            if (arreglo[i] % 2 != 0) {
                impares++;
            }
        }

        int pares = tamaño - impares;

        System.out.println("-----------------------------------");
        System.out.println("Valor más grande en el arreglo: " + maximo);
        System.out.println("Valor más pequeño en el arreglo: " + minimo);
        System.out.println("Valores impares en el arreglo: " + impares);
        System.out.println("Valores pares en el arreglo: " + pares);
        System.out.println("-----------------------------------");
    }
}