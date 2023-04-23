package transport;

public class EmptyGasTankException extends RuntimeException {
    private Transport<? extends Driver> transport;

    public EmptyGasTankException(Transport<? extends Driver> transport) {
        super();
        this.transport = transport;
    }

    public String reason() {
        return "У транспортного средства " + transport.getBrand() + " " + transport.getModel() + " закончилось топливо";
    }
}
