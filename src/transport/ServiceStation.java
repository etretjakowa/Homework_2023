package transport;

import java.util.Queue;

public class ServiceStation {
    private Queue<Transport> transportQueue;

    public ServiceStation(Queue<Transport> transportQueue) {
        this.transportQueue = transportQueue;
    }

    public void addCarYoQueue(Transport transport) {
        if (transport.checkTransportNeedSTO()) {
            transportQueue.add(transport);
        }
    }

    public void carryOutAVehicleInspection(Queue<Transport> transportQueue) {
        if (transportQueue.isEmpty()) {
            System.out.println("У данного транспортного средства нет механиков");
        } else {
            for (int i = 0; i < transportQueue.size(); i++ ) {
                Mechanic mechanic = (Mechanic) transportQueue.poll().getMechanic();
                mechanic.maintenance();
            }
        }
    }
}
