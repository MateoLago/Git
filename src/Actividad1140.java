import java.util.Scanner;
public class Actividad1140 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num=sc.nextInt();
        for (int i=0; i<num; i++) {
            for (int j=0; j<num-1-i; j++) {
                System.out.print(" ");
            }
            for (int j=0; j<i;j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
