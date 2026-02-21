package rentingscooters.view;

import rentingscooters.domain.PickupPoint;
import rentingscooters.domain.Scooter;
import rentingscooters.services.ScooterServiceImpl;
import rentingscooters.util.DateUtil;

import java.util.Scanner;

public class ScooterView {

    private final ScooterServiceImpl scooterService;
    private final Scooter scooter;
    private final PickupPoint pickupPoint;
    Scanner sc = new Scanner(System.in);

    public ScooterView(ScooterServiceImpl scooterService, Scooter scooter, PickupPoint pickupPoint) {
        this.scooterService = scooterService;
        this.scooter = scooter;
        this.pickupPoint = pickupPoint;
    }


    public void createScooterView(){

        System.out.println("Ingrese el id del scooter");
        int id = sc.nextInt();
        scooter.setIdVehicle(id);
        sc.nextLine();
        System.out.println("Ingrese la marcar del scooter");
        String brand = sc.nextLine();
        scooter.setBrand(brand);
        System.out.println("Ingrese el modelo del scooter");
        String model = sc.nextLine();
        scooter.setModel(model);
        System.out.println("Ingrese el color del scooter");
        String color = sc.nextLine();
        scooter.setColor(color);
        System.out.println("Ingrese la capacidad de pasajeros del scooter");
        int paxCapacity = sc.nextInt();
        scooter.setPaxCapacity(paxCapacity);
        sc.nextLine();
        System.out.println("Ingrese la referencia del scooter");
        String reference = sc.nextLine();
        scooter.setReference(reference);
        System.out.println("Ingrese la placa del scooter");
        String plate = sc.nextLine();
        scooter.setPlate(plate);
        System.out.println("Ingrese si el scooter esta disponible para renta (true/false)");
        boolean availableForRent = sc.nextBoolean();
        scooter.setAvailableForRent(availableForRent);
        System.out.println("Ingrese la capacidad del motor del scooter");
        float engineCapacity = sc.nextFloat();
        scooter.setEngineCapacity(engineCapacity);
        sc.nextLine();
        System.out.println("Ingrese el precio por hora del scooter");
        double pricePerHour = sc.nextDouble();
        scooter.setPricePerHour(pricePerHour);
        sc.nextLine();
        System.out.println("Ingrese la fecha del ultimo mantenimiento del scooter (dd/MM/yyyy)");
        String lastMaintenanceDate = sc.nextLine();
        scooter.setLastMaintenanceDate(DateUtil.convertStringToDate(lastMaintenanceDate));
        scooter.setPickupPoint(pickupPoint); ;




        scooterService.createScooter(scooter);
    }








}
