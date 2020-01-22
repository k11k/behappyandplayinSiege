import java.util.Scanner;

public class ZadachaStroki {

    public static void main(String args[]) {
        System.out.println("Введите строку");
        Scanner inputstring = new Scanner(System.in);
        String str = new String();
        str = inputstring.next();
        int i = str.length() - 1;          //номер символа
        int k = 0;                  //количество букв b

        for (int p = 0; p < str.length(); p++) {
            char ch = str.charAt(i);
            if ( ch == 'b') {
                k = k + 1;
            }
            i = i - 1;
        } System.out.println(k);
    }
}
