public class Spot {
    public int spot_id;
    VehicleType vehicletype;
    int vehicle_id;
    boolean isAvailable=false;

    public Spot(int id)
    {
        this.spot_id=id;
    }

    public void assignVehicle(int id)
    {
        this.vehicle_id=id;
        isAvailable=true;
    }
    public  void removeVehicle()
    {
        isAvailable=false;
        vehicle_id=-1;
    }



}
