import java.util.Scanner;

public class TEST {
    public static void main(String args[]) {
        System.out.println("Введите любое слово");
        Scanner inputword = new Scanner(System.in);
        String word;
        boolean exit;
        exit = false;
        for (int i = 1; i > 0; i++) {
            word = inputword.next();
            System.out.println(word);
            if (exit == true)
            break;
        }
    }
}
