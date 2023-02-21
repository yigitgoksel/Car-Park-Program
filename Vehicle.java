
public class Vehicle {
	private String plateNumber;
	private int size;

	 public Vehicle(String plateNumber, int size) {
		this.plateNumber=plateNumber;
		this.size=size;
	 }
	 
	 
	public String getPlateNumber() {
		return plateNumber;
	}
	
	public int getSize() {
		return size;
	}
	
	public void getVehicleInfo() {
		System.out.println("Vehicle info");
		System.out.println("Plate number: "+getPlateNumber());
		System.out.println("Size: "+getSize());
	}
	
}
