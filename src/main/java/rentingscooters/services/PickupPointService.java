package rentingscooters.services;

import rentingscooters.domain.PickupPoint;

public interface PickupPointService {

    public PickupPoint createPickupPoint(PickupPoint pickupPoint);
    public PickupPoint getPickupPointById(int id);
    public PickupPoint getAllPickupPoints();
    public PickupPoint updatePickupPoint(PickupPoint pickupPoint);
    public void deletePickupPoint(int id);

}
