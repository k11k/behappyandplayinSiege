class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;
}
class VehicleDEMO {
    public static void main(String args[]){
        Vehicle minivan = new Vehicle();
        int range;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        range = minivan.fuelcap * minivan.mpg;
        System.out.println("Минифургон может перевести " + minivan.passengers + " пассажиров на расстояние " + range + " миль");
    }
}
