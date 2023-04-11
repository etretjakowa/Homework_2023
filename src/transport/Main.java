package transport;

public class Main {
    public static void main(String[] args) {

        DriverB driverB1 = new DriverB("1 категории B", true, 2);
        Car carLada = new Car("Lada", "Granta", 1.7, driverB1, Car.BodyType.SEDAN);
        carLada.printInfo();
        System.out.println(carLada);
        carLada.getType();
        System.out.println();

        DriverB driverB2 = new DriverB("2 категории B", true, 1);
        Car carAudi = new Car("Audi", "A8 50 L TDI quattro", 1.5, driverB2, Car.BodyType.SEDAN);
        carAudi.printInfo();
        System.out.println(carAudi);
        carAudi.getType();
        System.out.println();

        DriverB driverB3 = new DriverB("3 категории B", true, 1);
        Car carBMW = new Car("BMW", "Z8", 3.0, driverB3, Car.BodyType.STATION_WAGON);
        carBMW.printInfo();
        System.out.println(carBMW);
        carBMW.getType();
        System.out.println();

        DriverB driverB4 = new DriverB("4 категории B", true, 1);
        Car carKia = new Car("Kia", "Sportage 4-го поколения", 1.7, driverB4, Car.BodyType.CROSSOVER);
        carKia.printInfo();
        System.out.println(carKia);
        carKia.getType();
        System.out.println();


        DriverD driverD1 = new DriverD("1 категории D", true, 6);
        Bus bus1 = new Bus("ЛиАЗ", "5256", 6.0, driverD1, Bus.ClassificationBus.getValueBus(28));
        bus1.printInfo();
        System.out.println(bus1);
        bus1.getType();
        System.out.println();

        DriverD driverD2 = new DriverD("2 категории D", true, 3);
        Bus bus2 = new Bus("МАЗ", "203", 5.8, driverD2, Bus.ClassificationBus.XL);
        bus2.printInfo();
        System.out.println(bus2);
        bus2.getType();
        System.out.println();

        DriverD driverD3 = new DriverD("3 категории D", true, 5);
        Bus bus3 = new Bus("Volvo", "DH12", 7.0, driverD3, Bus.ClassificationBus.M);
        bus3.printInfo();
        System.out.println(bus3);
        bus3.getType();
        System.out.println();

        DriverD driverD4 = new DriverD("4 категории D", true, 4);
        Bus bus4 = new Bus("ПАЗ", "102", 4.5, driverD4, Bus.ClassificationBus.S);
        bus4.printInfo();
        System.out.println(bus4);
        bus4.getType();
        System.out.println();

        DriverC driverC1 = new DriverC("1 категории C", true, 4);
        DriverC driverC2 = new DriverC("2 категории C", true, 4);
        DriverC driverC3 = new DriverC("3 категории C", true, 4);
        DriverC driverC4 = new DriverC("4 категории C", true, 4);

        Truck truck1 = new Truck("Камаз", "1", 8.0, driverC1, Truck.LoadCapacity.getValue(10));
        truck1.printInfo();
        System.out.println(truck1);
        truck1.getType();
        System.out.println();

        Truck truck2 = new Truck("МАЗ", "2", 9.0, driverC2, Truck.LoadCapacity.N2);
        truck2.printInfo();
        System.out.println(truck2);
        truck2.getType();
        System.out.println();

        Truck truck3 = new Truck("ГАЗ", "1", 6.5, driverC3, Truck.LoadCapacity.N3);
        truck3.printInfo();
        System.out.println(truck3);
        truck3.getType();
        System.out.println();

        Truck truck4 = new Truck("ТОНАР", "1", 9.8, driverC4, Truck.LoadCapacity.getValue(5));
        truck4.printInfo();
        System.out.println(truck4);
        truck4.getType();
        System.out.println();
    }
}