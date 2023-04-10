package transport;

public class Main {
    public static void main(String[] args) {
        DriverB driverB1 = new DriverB("1 категории B", true, 2);
        Car carLada = new Car("Lada", "Granta", 1.7, driverB1);
        carLada.printInfo();
//
//
//        Car carAudi = new Car("Audi", "A8 50 L TDI quattro", 1.5);
//
//        Car carBMW = new Car("BMW", "Z8", 3.0);
//
//        Car carKia = new Car("Kia", "Sportage 4-го поколения", 2.4);
//
//        Car carHyundai = new Car("Hyundai", "Avante", 1.6);
//
//        Bus bus1 = new Bus("Камаз", "5299", 6.0,"1");
//        Bus bus2 = new Bus("МАЗ", "203", 5.8);
//        Bus bus3 = new Bus("Volvo", "DH12", 7.0);
//        Bus bus4 = new Bus("ПАЗ", "102", 4.5);
//
//        Truck truck1=new Truck("Камаз", "1", 8.0);
//        Truck truck2=new Truck("МАЗ", "2", 9.0);
//        Truck truck3=new Truck("ГАЗ", "1", 6.5);
//        Truck truck4=new Truck("ТОНАР", "1", 9.8);
////

       System.out.println(carLada);
//        System.out.println(carAudi);
//        System.out.println(carBMW);
//        System.out.println(carKia);
//        System.out.println(carHyundai);
//        System.out.println(bus1);
//        System.out.println(bus2);
//        System.out.println(bus3);
//        System.out.println(truck1);
//        System.out.println(truck2);
//        System.out.println(truck3);
//        System.out.println(truck4);


//        Car carLada = new Car("Lada", "Granta", "Россия", "жёлтый", 2015, 160, 4, "седан",
//                1.7, "МКП", "вв444с", false, new Car.Key(true, false));
//
//        Car carAudi = new Car("Audi", "A8 50 L TDI quattro", "Германия", "черный", 2018, 250, 5,
//                "седан", 1.5, "АКП", "sd84w", false, new Car.Key(false, false));
//
//        Car carBMW = new Car("BMW", "Z8", "Германия", "черный", 2020, 300, 5,
//                "седан", 3.0, "АКП", "вhf784с", true, new Car.Key(false, true));
//
//        Car carKia = new Car("Kia", "Sportage 4-го поколения", "Южная Корея", "красный", 2018,
//                180, 5, "красный", 2.4,"АКП", "ut45j", false, new Car.Key(true, true));
//
//        Car carHyundai = new Car("Hyundai", "Avante", "Южная Корея",null,2000, 200, 5,
//                "кроссовер", 1.6, "qdd78d", "АКП",  false, new Car.Key(true, false));
//
//        Bus bus1 = new Bus("Камаз", "5299", "Россия", "белый", 2022, 120);
//        Bus bus2 = new Bus("МАЗ", "203", "Россия", "голубой", 2023, 120);
//        Bus bus3 = new Bus("Volvo", "DH12", "Швеция", "белый", 2022, 120);
//        System.out.println(carLada);
//        System.out.println(carAudi);
//        System.out.println(carBMW);
//        System.out.println(carKia);
//        System.out.println(carHyundai);
//        System.out.println(bus1);
//        System.out.println(bus2);
//        System.out.println(bus3);
    }
}