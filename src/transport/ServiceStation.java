package transport;

import java.util.Queue;

public class ServiceStation {
    private Queue<Transport> transportQueue;

    public ServiceStation(Queue<Transport> transportQueue) {
        this.transportQueue = transportQueue;
    }

    public void addCarinQueue(Transport transport) {
        if (transport instanceof Bus) {
            System.out.println("Автобусы не нуждаются в техобслуживании перед заездом");
        } else {
            transportQueue.add(transport);
        }

    }

            public void carryOutAVehIcleInspection() {
        if (transportQueue.isEmpty()) {
            System.out.println(" нет авто в очереди");
        } else {
            System.out.println(" обслуживаем " + transportQueue.poll().getBrand());

        }
    }
}
