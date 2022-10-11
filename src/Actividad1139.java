import java.util.Scanner;
public class Actividad1139 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num= sc.nextInt();
        for (int i=0; i<num; i++) {
            for (int k=0; k<i; k++) { // aumenta los espacios a medida que se van sumando las filas
                System.out.print(" ");
            }
            System.out.print("*"); // imprime un * por fila
            System.out.println(""); // salto de linea
            }
    }
}
