import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ParkingLot {
    List<Floor> listoffloor=new ArrayList<>();
    public void setfloor(Floor floor)
    {

        listoffloor.add(floor);
    }
    public Floor  getFloor(int i)
    {
        return listoffloor.get(i);
    }
    public Optional<Spot> isAvailable()
    {
        for(Floor floor:listoffloor)
        {
            if(floor.getAvailableSpot().isPresent())
            {
                return floor.getAvailableSpot();
            }
        }
        return Optional.empty();
    }



}
