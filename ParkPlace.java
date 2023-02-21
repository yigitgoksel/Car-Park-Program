
public class ParkPlace {
	int size;
	Vehicle vehicle;
	
	public ParkPlace(Vehicle vehicle) {
		this.vehicle=vehicle;
	}
	
	public int getSize() {
		size=vehicle.getSize();
		return size;
	}
	
	public Vehicle getvehicle() {
		return vehicle;
	}
	
}
