import java.awt.*;

public class TransportTruck extends Truck {
    private StorageUnit storage;

    /**
     * Construct a new TransportTruck instance
     */
    TransportTruck() {
        x = 0;
        y = 0;
        nrDoors = 2;
        enginePower = 1000;
        currentSpeed = 0;
        color = Color.red;
        modelName = "Transport Truck";

        storage = new StorageUnit(this, 5);

        stopEngine();
    }

    /**
     * Gets the widht of the TransportTruck
     *
     * @return width of the TransportTruck
     */
    @Override
    public int getWidth() {
        return 260;
    }

    /**
     * Gets the height of the TransportTruck
     *
     * @return height of the TransportTruck
     */
    @Override
    public int getHeight() {
        return 320;
    }

    /**
     * Gets the depth of the TransportTruck
     *
     * @return depth of the TransportTruck
     */
    @Override
    public int getDepth() {
        return 680;
    }

    @Override
    protected double speedFactor() {
        return 1;
    }

    /**
     * TransportTruck is eligible to move if ramp is closed
     *
     * @return TransportTruck can move
     */
    @Override
    public boolean canMove() {
        return storage.isRampClosed();
    }

    /**
     * Move truck.
     */
    @Override
    public void move() {
        super.move();
        storage.onMovement();
    }

    /**
     * Can drop the ramp if the TransportTruck is on standby
     */
    public void dropRamp() {
        if (currentSpeed == 0) {
            storage.dropRamp();
        }
    }

    /**
     * Can raise the ramp if the TransportTruck is on standby
     */
    public void raiseRamp() {
        if (currentSpeed == 0) {
            storage.raiseRamp();
        }
    }

    /**
     * Loads vehicle on to the TransportTruck if ramp is down
     *
     * @param vehicle loads on to the TransportTruck
     */
    public void loadVehicle(Vehicle vehicle) {
        storage.addVehicle(vehicle);
    }

    /**
     * Unloads last vehicle from the TransportTruck
     *
     * @return unload last vehicle from the TransportTruck
     */
    public Vehicle unloadLastVehicle() {
        return storage.removeVehicleBack();
    }
}
