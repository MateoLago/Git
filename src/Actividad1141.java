import java.util.Scanner;
public class Actividad1141 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = sc.nextInt();
        for (int i=0; i<num; i++) {
            for (int k=0; k<i; k++) { // aumenta los espacios a medida que se van sumando las filas
                System.out.print(" ");
          } for (int j=0; j<num-i; j++) { // imprime los * con la resta entre num e i ( primer fila hasta que j se menor que 5)
                System.out.print(" *");
            }
            System.out.println(""); // salto de linea
        }
    }
}