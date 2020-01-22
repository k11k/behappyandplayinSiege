import java.util.Scanner;

public class zadacha13 {
    public static void main(String args[]) {
        System.out.println("Введите первое число");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Введите второе число");
        int b = sc.nextInt();
        int d  = 0;
        int c = 0;

        while (a > 0) {
            d = a % 10;
            a = a / 10;
            c = b;
            while (c > 0){
                if ( d == c % 10){
                    System.out.print(d +" ");
                    break;
                }
                c = c / 10;
            }
        } System.out.println();
    }
}
