public class Box {
    double width;
    double height;
    double depth;

    //конструктор
    Box (double w, double h, double d) {
        System.out.println("Конструирование объекта Box");
        this.width = w;
        this.height = h;
        this.depth = d;
    }

//вэтом классе объявляетсяобъект типа box

    //вывести объём
    double volume() {
        return width*height*depth;
    }

}
class BoxDemo2 {
    public static void main (String args[]){
        Box mybox = new Box(10,20,15);
        Box mybox2 = new Box(3,6,9);
        double vol;

        //присвоитьзначение переменным экземпляра mybox
        //расчитать объём параллелепипеда
        System.out.println(mybox.volume());
        System.out.println(mybox2.volume());
    }

}
