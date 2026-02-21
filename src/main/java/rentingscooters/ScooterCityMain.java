package rentingscooters;

import rentingscooters.domain.PickupPoint;
import rentingscooters.domain.Scooter;
import rentingscooters.services.PickupPointServiceImpl;
import rentingscooters.services.ScooterServiceImpl;
import rentingscooters.view.PickupPointView;
import rentingscooters.view.ScooterView;

public class ScooterCityMain {
    public static void main(String[] args) {

        ScooterServiceImpl scooterService = new ScooterServiceImpl();

        Scooter scooter = new Scooter();

        PickupPoint pickupPoint = new PickupPoint();

        PickupPointServiceImpl pickupPointService = new PickupPointServiceImpl();



        ScooterView scooterView = new ScooterView(scooterService, scooter, pickupPoint);
        PickupPointView pickupPointView = new PickupPointView( pickupPoint, pickupPointService);

        pickupPointView.createPickupPointView();
        pickupPointService.createPickupPoint(pickupPoint);
        scooterView.createScooterView();
        scooterService.printScooter(scooter);

    }
}
