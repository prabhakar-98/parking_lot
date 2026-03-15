import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Floor {
    int floor_id;
    List<Spot> listofspot= new ArrayList<>();
    public Floor(int id,List<Spot> list)
    {
        this.floor_id=id;
        this.listofspot=list;
    }
   public  Floor(int id)
    {
        this.floor_id=id;
    }
   public void setSpot(Spot spot)
    {
        listofspot.add(spot);
    }
   public List<Spot> getSpot()
    {
        return listofspot;
    }

    public int getFloorNumber()
    {
        return floor_id;
    }

    public Optional<Spot> getAvailableSpot()
    {
        List<Spot> list= listofspot.stream().filter(spot->spot.isAvailable).toList();
        return list.stream().findFirst();
    }
    public void park(Spot spot, Vehicle vehicle)
    {
        spot.assignVehicle(vehicle.vehicle_id);
        System.out.println("Park Successfully");
    }

    public void unpark(Spot spot)
    {
        spot.removeVehicle();;
        System.out.println("Unpark Successfully");
    }
}
