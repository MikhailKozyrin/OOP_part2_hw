public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota Camry", 4);
        Car car2 = new Car("Honda Civic", 4);


        Truck truck = new Truck("Volvo H1", 8);
        Truck truck2 = new Truck("MAN TUNDRA", 10);


        Bicycle bicycle = new Bicycle("Suzuki Air 01", 2);
        Bicycle bicycle2 = new Bicycle("Yamaha Hurricane 3.0 V", 3);


        ServiceStation station = new ServiceStation();
        station.check(car2);
        station.check(bicycle);
        station.check(truck2);


    }
}