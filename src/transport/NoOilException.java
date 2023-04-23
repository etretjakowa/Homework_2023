package transport;

public class NoOilException extends RuntimeException {
    private Transport<? extends Driver> transport;

    public NoOilException(Transport<? extends Driver> transport) {
        super();
        this.transport = transport;
    }

    public String reason() {
        return "У транспортного средства " + transport.getBrand() + " " + transport.getModel() + " закончилось масло";
    }
}
