import java.util.Scanner;

public class VOZDUCH {

    public static void main(String args[]) {
        while (true) {
            System.out.println("Расчёт диаметра наконечника");
            System.out.println("Введите скорость воздушного потока");
            Scanner inputword = new Scanner(System.in);
            float speed = inputword.nextFloat();
            int d = 0;                //диаметр наконечника
            float rashod = 20;        //максимальный расход
            double rashod2 = 0;       //искомый расход
            double constanta = 0.047;


            for (d = 10; d >= 1; d--) {
                rashod2 = speed * d * d * constanta;
                if (rashod2 <= rashod) {
                    System.out.println("Нужный диаметр наконечника = " + d);
                    System.out.println("Нужный расход аспиратора ="+String.format("%8.1f",rashod2).replace(',','.'));
                    break;
                }
            }
        }
    }
}

