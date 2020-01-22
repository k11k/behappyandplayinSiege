import java.util.Random;

public class zadachaarray {
    public static void main(String args[]) {
        Random rand = new Random();
        int array[] = new int[100];
        int i = 0;
        System.out.println("Сгенерированный массив");

        for (i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
            if (i % 10 == 0) {
                System.out.println();
            }
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        System.out.println("Элементы больше предидущего");
        for (i = 0; i < array.length-1; i++) {
            if (array[i] < array[i + 1]) {
                System.out.print(array[i + 1] + " ");
            }
        }
    }
}
