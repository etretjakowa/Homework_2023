public class Main {
    public static void main(String[] args) {

        Car carLada = new Car("Lada", "Granta", 2015, "Россия", 4, "седан",
                1.7, "жёлтый", "МКП", "вв444с", true, new Car.Key(true,false));

        Car carAudi = new Car("Audi", "A8 50 L TDI quattro", 2018, "Германиячерный", 5,
                "седанГермания", 1.5, "черный", "АКП", "sd84w", false, new Car.Key(false,false));

        Car carBMW = new Car("BMW", "Z8", 2020, "Германия", 5,
                null, 3.0, "черный", "АКП", "вhf784с", true, new Car.Key(false,true));

        Car carKia = new Car("Kia", "Sportage 4-го поколения", 2023, "Южная Корея", 2018,
                "", 2.4, "красный", "АКП", "ut45j", false, new Car.Key(true,true));

        Car carHyundai = new Car("Hyundai", "Avante", 2000, "Южная Корея", 2022,
                "", 1.6, "оранжевый", "АКП", "qdd78d", false, new Car.Key(true,false));



        System.out.println(carLada);
        System.out.println(carAudi);
        System.out.println(carBMW);
        System.out.println(carKia);
        System.out.println(carHyundai);
    }
}