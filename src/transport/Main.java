package transport;

import java.util.*;

public class Main {
    public static void main(String[] args) throws DiagnosticNotAllowedException {

        Map<Transport, List<Mechanic>> map = new HashMap<>();
        List<Transport> transports = new ArrayList<>();

        List<Mechanic> mechanics = new ArrayList<>();
        Mechanic mechanic1 = new Mechanic("Иван", "1");
        Mechanic mechanic2 = new Mechanic("Сергей", "2");
        Mechanic mechanic3 = new Mechanic("Алексей", "3");
        Mechanic mechanic4 = new Mechanic("Евгений", "4");
        mechanics.add(mechanic1);
        mechanics.add(mechanic2);
        mechanics.add(mechanic3);
        mechanics.add(mechanic4);


        DriverB driverB1 = new DriverB("1 категории B", true, 2);
        Car carLada = new Car("Lada", "Granta", 1.7, driverB1, Car.BodyType.SEDAN, mechanics);
        transports.add(carLada);

        DriverB driverB2 = new DriverB("2 категории B", true, 1);
        Car carAudi = new Car("Audi", "A8 50 L TDI quattro", 1.5, driverB2, Car.BodyType.SEDAN, mechanics);
        transports.add(carAudi);


        DriverB driverB3 = new DriverB("3 категории B", true, 1);
        Car carBMW = new Car("BMW", "Z8", 3.0, driverB3, Car.BodyType.STATION_WAGON, mechanics);
        transports.add(carBMW);

        DriverB driverB4 = new DriverB("4 категории B", true, 1);
        Car carKia = new Car("Kia", "Sportage 4-го поколения", 1.7, driverB4, Car.BodyType.CROSSOVER, mechanics);
        transports.add(carKia);

        DriverD driverD1 = new DriverD("1 категории D", true, 6);
        Bus bus1 = new Bus("ЛиАЗ", "5256", 6.0, driverD1, Bus.ClassificationBus.getValueBus(28), mechanics);
        transports.add(bus1);

        DriverD driverD2 = new DriverD("2 категории D", true, 3);
        Bus bus2 = new Bus("МАЗ", "203", 5.8, driverD2, Bus.ClassificationBus.XL, mechanics);
        transports.add(bus2);

        DriverD driverD3 = new DriverD("3 категории D", true, 5);
        Bus bus3 = new Bus("Volvo", "DH12", 7.0, driverD3, Bus.ClassificationBus.M, mechanics);
        transports.add(bus3);

        DriverD driverD4 = new DriverD("4 категории D", true, 4);
        Bus bus4 = new Bus("ПАЗ", "102", 4.5, driverD4, Bus.ClassificationBus.S, mechanics);
        transports.add(bus4);

        DriverC driverC1 = new DriverC("1 категории C", true, 4);
        DriverC driverC2 = new DriverC("2 категории C", true, 4);
        DriverC driverC3 = new DriverC("3 категории C", true, 4);
        DriverC driverC4 = new DriverC("4 категории C", true, 4);


        Truck truck1 = new Truck("Камаз", "1", 8.0, driverC1, Truck.LoadCapacity.N3, mechanics);
        transports.add(truck1);


        Truck truck2 = new Truck("МАЗ", "2", 9.0, driverC2, Truck.LoadCapacity.N1, mechanics);
        transports.add(truck2);

        Truck truck3 = new Truck("ГАЗ", "1", 6.5, driverC3, Truck.LoadCapacity.N3, mechanics);
        transports.add(truck3);

        Truck truck4 = new Truck("ТОНАР", "1", 9.8, driverC4, Truck.LoadCapacity.N1, mechanics);
        transports.add(truck4);

        for (Transport transport : transports) {
            map.put(transport, transport.getMechanics());
        }

        System.out.println(map);
        for (Map.Entry<Transport, List<Mechanic>> transport: map.entrySet()) {
            System.out.println(transport.getKey() + "-" + transport.getValue());
        }
    }

//        Transport[] transports = new Transport[] {
//                carLada, carAudi, carBMW, carKia,
//                bus1, bus2, bus3, bus4,
//                truck1, truck2, truck3, truck4
//        };
//        for (Transport transport : transports) {
//            try {
//                transport.startMov();
//            } catch (EmptyGasTankException e) {
//                System.out.println(e.reason());
//            } catch (NoOilException e) {
//                System.out.println(e.reason());
//            }
//            try {
//                transport.runDiagnostic();
//            } catch (DiagnosticNotAllowedException e) {
//                e.printStackTrace();
//            }
//        }
    }
