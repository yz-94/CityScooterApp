package rentingscooters.view;

import rentingscooters.domain.PickupPoint;
import rentingscooters.services.PickupPointServiceImpl;
import rentingscooters.util.ConsoleReader;

import static rentingscooters.util.ConsoleReader.*;

public class PickupPointView {


    private final PickupPoint pickupPoint;
    private final PickupPointServiceImpl pickupPointService;

    public PickupPointView(PickupPoint pickupPoint , PickupPointServiceImpl pickupPointService) {
        this.pickupPoint = pickupPoint;
        this.pickupPointService = pickupPointService;
    }

    public void createPickupPointView() {

        System.out.println("Ingrese el Id del punto de recogida: ");
        int idPickupPoint = sc.nextInt();
        pickupPoint.setIdPickupPoint(idPickupPoint);
        sc.nextLine();
        System.out.println("Ingrese el nombre del punto de recogida: ");
        String pointName = sc.nextLine();
        pickupPoint.setPointName(pointName);
        System.out.println("Ingrese la ubicación del punto de recogida: ");
        String location = sc.nextLine();
        pickupPoint.setLocation(location);
        System.out.println("Ingrese si el punto de recogida esta activo para renta (true/false): ");
        boolean isActive = sc.nextBoolean();
        pickupPoint.setActive(isActive);




        pickupPointService.createPickupPoint(pickupPoint);



    }





}
