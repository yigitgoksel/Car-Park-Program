import java.util.Date;
import java.util.ArrayList;


public class CarPark {
	int capacity;
	ArrayList<ParkPlace> parkplacearray = new ArrayList<ParkPlace>();
	//ParkPlace[] parkplacearray=new ParkPlace[capacity];
	//Ticket [] ticketArray;
	ArrayList<Ticket> ticketArray = new ArrayList<Ticket>();
	double hourlyprice;
	
	public CarPark(int capacity,double hourlyprice) {
		this.capacity=capacity;
		this.hourlyprice=hourlyprice;
	}
	
	public Ticket parkVehicle(Vehicle vehicle, Date entryDate) {
		
		if(parkplacearray.size()< capacity) {
			
			ParkPlace parkPlace=new ParkPlace(vehicle);
			parkplacearray.add(parkPlace);
			
			Ticket ticket = new Ticket(vehicle, entryDate);
			ticketArray.add(ticket);
		
		System.out.println("The vehicle with "+ vehicle.getPlateNumber()+" plate number is parked.");
		
	
		return ticket;
		
		}else {
			
			System.out.println(" Car park is full! ");
			
			return null;
		}
	}
	
	public Vehicle exitVehicle(Ticket ticket, Date exitDate) {
		
		
		return ticket.getVehicle();
	}
	
	
	 public double totalIncome() {
		 
		 double income = 0;
		 
		 for(int i=0;i< ticketArray.size();i++) {
			 
			 income = income + ticketArray.get(i).getPrice();
		
		 }
		 
		 return income;
	 }
	
	 public void printVehicleList() {
		 for(int i=0;i< parkplacearray.size();i++) {
			 
			 Vehicle vehicle = parkplacearray.get(i).vehicle;
			 
			 vehicle.getVehicleInfo();
		 }
	 }
	
	 public void printTickets() {
		 for(int i=0;i< ticketArray.size();i++) {
			 
			 ticketArray.get(i).getTicketInfo();
			 
		
		 }
	 }
	
	 
	
}
