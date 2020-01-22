import java.util.Random;
import java.util.Scanner;

public class ZadachaArray2 {
        public static void main(String args[]) {
            MyRandom random = new MyRandom();
            System.out.println("Введите длинну массива");
            Scanner sc = new Scanner(System.in);
            int array[] = new int[sc.nextInt()];
            int i = 0;
            int min = 100;
            System.out.println("Сгенерированный массив");
            for (i=0; i < array.length; i++) {
                array[i] = random.nextInt(50,-50);
                System.out.print(array[i] + " ");
                if (i % 10 == 0) {
                    System.out.println();
                }
            }
            System.out.println();
            for (i=0; i < array.length-1; i++){
                min = Math.min(Math.abs(array[i]),min);
            }
                System.out.println("минимальный по модулю " +min);
            System.out.println("Его номер в масиве");
            for (i=0; i < array.length; i++) {
                if (Math.abs(array[i]) == min) {
                    System.out.print(" "  +i);
                }
            }
        }
}
class MyRandom {
    public int nextInt (int first, int second) {
        Random random = new Random();
        int min = Math.min(first, second);
        int max = Math.max(first,second);
        int bound = max - min;
        int i = random.nextInt(bound) + min;
        return i;
    }
}
