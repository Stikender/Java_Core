package transport;

import java.util.ArrayDeque;
import java.util.Queue;

public class ServiceStation {
    private final Queue<Transport> transportQueue = new ArrayDeque<>();

    public void addCarQueue(Transport transport) {
        if (transport instanceof Bus) {
            System.out.println("Автобус пройти техобслуживание не может");
        } else {
            transportQueue.add(transport);
        }
    }

    public void carryOutVehicle() {
        Transport transport = transportQueue.poll();

        if (transport != null) {
            transport.getMechanics().get(0).carryOutMaintenance();
        }
    }
}
