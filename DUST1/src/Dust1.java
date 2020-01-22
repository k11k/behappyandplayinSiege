import java.util.Scanner;

public class Dust1 {

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        //System.out.println("Введите норматив ");
        double normativ = 0.003212000;
        System.out.println("норматив " +normativ);
        //System.out.println("Введите массы фильтра до/после");
        double m1 =0.0936; //до
        double m2 =0.1041; //после
        //System.out.println("Введите массы фильтра на трубке");
        double mt1 =0.0984; //до
        double mt2=0;  //после
        //System.out.println("Введите массы контрольного фильтра");
        double mkf1=0.0968; //до
        double mkf2=0.0969; //после
        //Filter f1 = new Filter(m1,m2);
        //Filter f2 = new Filter(mt1,mt2);
        //Filter f3 = new Filter(mkf1,mkf2);
        double deltaM = m2-m1;
        double mindeltaM = 0.0006;
        double deltaT = deltaM*0.3;
        double mindeltaT = 0.0004;
        double mindeltaK=0;
        double minbigdelta = mindeltaM + mindeltaT +mindeltaK;
        mt2 = deltaT + mt1;
        double deltaK = mkf2-mkf1;
        int atmPressure = 100200;
        float speed = (float) 8.23;
        float temp = (float) 21;
        float overpressure = (float) (0.64*1000);
        double sqr = 0.049;
        int time = 10;
        int nakonechnik=0;
        float rashod=0;
        float halfrashod=0;
        float halnakonecnik;
        for (int halfnakonechnik = 10; halfnakonechnik >=3; halfnakonechnik--) {
            halfrashod = (float) (2.45 * 0.001 * halfnakonechnik * halfnakonechnik * speed * ((atmPressure - overpressure) / (273 + temp)) * Math.sqrt((273 + temp) / (atmPressure - overpressure)));
            if (halfrashod <= 20) {
                nakonechnik = halfnakonechnik;
                rashod = halfrashod;
                break;
            }
        }
        int b = nakonechnik;
        System.out.println("Наконнчник ёпат " +nakonechnik);
        System.out.println("Расход ёпат " +rashod);
        double conc;
        conc = (((deltaM+deltaK+deltaT)*1000*atmPressure*(273+temp))/(rashod*time*273*(atmPressure-overpressure)));
        //System.out.println("Концентрация до цикла в г/м3 " +conc*1000);
        double mass;
        mass = conc*speed*sqr;
        //System.out.println("массовый выброс до цикла " +mass);
        double bigDelta = deltaM+deltaT+deltaK;
        //System.out.println("Проверка " +bigDelta);

        while (bigDelta>=minbigdelta && mass > normativ) {
            bigDelta = bigDelta - 0.0001;
            deltaM = (bigDelta - deltaT) / (1 + 0.35);
            deltaT = deltaM * 0.35;
            m2 = deltaM + m1;
            mt2 = deltaT + mt1;
            rashod =(float)(2.45*0.001*nakonechnik*nakonechnik*speed*((atmPressure-overpressure)/(273+temp))*Math.sqrt((273+temp)/(atmPressure-overpressure)));
            conc = (((bigDelta) * 1000 * atmPressure * (273 + temp)) / (rashod * time * 273 * (atmPressure - overpressure)));
            mass = conc * speed * sqr;
        }
        int newnakonechnik;
        float newrashod;
        float newspeed = speed;
        while (mass >= normativ & newspeed >=3) {
            newspeed = newspeed - 1;
            for (newnakonechnik = 10; newnakonechnik >= 3; newnakonechnik--) {
                newrashod = (float) (2.45 * 0.001 * newnakonechnik * newnakonechnik * newspeed * ((atmPressure - overpressure) / (273 + temp)) * Math.sqrt((273 + temp) / (atmPressure - overpressure)));
                if (newrashod <= 20) {
                    conc = (((bigDelta) * 1000 * atmPressure * (273 + temp)) / (newrashod * time * 273 * (atmPressure - overpressure)));
                    mass = conc * newspeed * sqr; //концентрация * скорость * площадь сечения И ОНО БЛЯДЬ НЕ МЕНЯЕТСЯ И ЦИКОЛ БЕСКОНЕЧЕН!!!!!!!!!!!!!!!!!!!
                    break;
                }
            }
        }


        System.out.println("Нужный диаметр наконечника = " + nakonechnik);
        System.out.println("расчитанная скорость = " + speed);
        //System.out.println("Нужный расход аспиратора =" + String.format("%8.1f", rashod).replace(',', '.'));
        System.out.println("получившийся вес фильтров: m1 " +m1 );
        System.out.println("получившийся вес фильтров: m2 " +m2);
        System.out.println("получившийся вес фильтров натрубке: mt1 " +mt1);
        System.out.println("получившийся вес фильтров натрубке: mt2 " +mt2);
        System.out.println("получившаяся концентрация " +conc*1000);
        System.out.println("получившийся выброс " +mass);
    }
}
