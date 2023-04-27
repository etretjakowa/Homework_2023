package transport;

public class Mechanic {
    private String nameMechanic;
    private String company;

    public Mechanic(String nameMechanic, String company) {
        this.nameMechanic = nameMechanic;
        this.company = company;
    }

    public String getNameMechanic() {
        return nameMechanic;
    }

    public void setNameMechanic(String nameMechanic) {
        this.nameMechanic = nameMechanic;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void maintenance() {
        System.out.println("Механик " + nameMechanic + " произвел техобслуживание");
    }

    public void fixACar() {
        System.out.println("Механик " + nameMechanic + " починил машину");

    }

    @Override
    public String toString() {
        return ", Механик №" +
                 nameMechanic + " работает в компании №" +  company;
    }
}
