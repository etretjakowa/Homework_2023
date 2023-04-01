public class Main {
    public static void main(String[] args) {

        Car carLada = new Car("Lada", "Granta", 1.7, "жёлтый", 2015, "Россия");
        Car carAudi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный",2020, "Германия");
        Car carBMW = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия");
        Car carKia = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея");
        Car carHyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016,"Южная Корея");



        System.out.println(carLada);
        System.out.println(carAudi);
        System.out.println(carBMW);
        System.out.println(carKia);
        System.out.println(carHyundai);
    }
}