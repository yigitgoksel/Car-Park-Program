
import java.util.Date;


public class Ticket {
	
	Vehicle vehicle;
	Date entryDate = new Date();
	Date exitDate = new Date();
	
	double totalprice;
	int numberoftickets;

	public Ticket(Vehicle vehicle, Date entryDate) {
		this.vehicle=vehicle;
		this.entryDate=entryDate;
		
	}
	
	public double calculateprice(double hourlyprice, Date exitDate) {
		
		
		long numberOfHours = (exitDate.getTime() - entryDate.getTime()) / (60 * 60 * 1000) % 24;
				
		double Parkingcost = vehicle.getSize() * hourlyprice * numberOfHours;
		
		totalprice = Parkingcost;
		
		return Parkingcost;
	}
	
	public Vehicle getVehicle() {
		return vehicle;
	}
	
	
	public double getPrice() {
		
		return totalprice;	
	}
	
	public void getTicketInfo() {
		System.out.println("Ticket Info:");
		System.out.println("Plate number: "+vehicle.getPlateNumber());
		System.out.println("Entry: "+entryDate.getTime());
	}
	
	
	
	
}
