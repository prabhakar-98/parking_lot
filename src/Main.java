import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");


        Vehicle vehicle1 = new Vehicle(VehicleType.Car, 2);
        Vehicle vehicle2 = new Vehicle(VehicleType.Bike, 3);
        Vehicle vehicle3 = new Vehicle(VehicleType.Truck, 4);
        Vehicle vehicle4 = new Vehicle(VehicleType.Car, 5);
        Vehicle vehicle5 = new Vehicle(VehicleType.Bus, 6);
        Vehicle vehicle6 = new Vehicle(VehicleType.Bike, 7);
        Vehicle vehicle7 = new Vehicle(VehicleType.Truck, 8);
        Vehicle vehicle8 = new Vehicle(VehicleType.Bus, 9);
        Vehicle vehicle9 = new Vehicle(VehicleType.MotorCycle, 10);
        Vehicle vehicle10 = new Vehicle(VehicleType.MotorCycle, 1);

        Spot spot1 = new Spot(1);
        Spot spot2 = new Spot(2);
        Spot spot3 = new Spot(3);
        Spot spot4 = new Spot(4);

        Floor floor1 = new Floor(1);
        Floor floor2 = new Floor(2);
        floor1.setSpot(spot1);
        floor1.setSpot(spot2);
        floor2.setSpot(spot3);
        floor2.setSpot(spot4);

        ParkingLot parking=new ParkingLot();
        parking.setfloor(floor2);
        parking.setfloor(floor1);

        System.out.println(parking.getFloor(0).floor_id);

    }

}