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
        } else {Transport transport = transportQueue.poll();
            System.out.println(" обслуживаем "+ transport.getBrand()+ " " + transport.getModel());


        }
    }
}
