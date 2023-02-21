import java.util.Date;

public class Test {

	public static void main(String[] args) {
		
		Vehicle vehicle1=new Vehicle("vehicle1",4);
		Vehicle vehicle2=new Vehicle("vehicle2",2);
		Vehicle vehicle3=new Vehicle("vehicle3",1);
		Vehicle vehicle4=new Vehicle("vehicle4",2);
		Vehicle vehicle5=new Vehicle("vehicle5",4);
		
		CarPark carPark = new CarPark(10,5);
		
		
		carPark.parkVehicle(vehicle1, new Date());
		carPark.parkVehicle(vehicle2, new Date());
		carPark.parkVehicle(vehicle3, new Date());
		carPark.parkVehicle(vehicle4, new Date());
		carPark.parkVehicle(vehicle5, new Date());
		
		carPark.printVehicleList();
		
		carPark.totalIncome();
		
		carPark.printTickets();
		
	}

}
