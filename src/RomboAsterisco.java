import java.util.Scanner;
public class RomboAsterisco {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num= sc.nextInt();
        for (int i=0; i<num;i++){
            for (int k=0; k<num-i-1;k++){
                System.out.print(" ");
            }
            for (int j=0; j<i+1;j++){
                System.out.print(" *");
            }
            System.out.println("");
        }
        int bajo= num;
        for (int i=0; i<bajo; i++) {
            for (int k=0; k<i; k++) {
                System.out.print(" ");
            } for (int j=0; j<bajo-i; j++) {
                System.out.print(" *");

            }
            System.out.println("");
        }


    }
}