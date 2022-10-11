import java.util.Scanner;
public class NumerosDivisibles2y3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int a = 0;
        int b = 0;
        for (i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("Numero multiple de 2: " + i);
                a = a + 1;
            } if (i % 3 == 0) {
                System.out.println("Numero multiple de 3: " + i);
                b = b + 1;
            }
        }
        System.out.println("Los numeros multiplos de 2 son:");
        System.out.println(a);
        System.out.println("Los numeros multiplos de 3 son:");
        System.out.println(b);
        }
}
