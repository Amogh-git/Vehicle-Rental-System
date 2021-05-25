import java.util.*;
import enums.*;
public class VehicleRentingSystem {

	static ArrayList<Car> cars = new ArrayList<Car>();
	static ArrayList<Bus> buses = new ArrayList<Bus>();
	static ArrayList<Truck> trucks = new ArrayList<Truck>();
	static IOUtility ioObject = new IOUtility();


	public static void addVehicle(int regNo, int rental, String name, String cat) {
	
		switch(VehicleCategory.valueOf(cat)) {
		case CAR:
			Car car = new Car(regNo, rental, name);
			cars.add(car);
			break;
		case BUS:
			Bus bus = new Bus(regNo, rental, name);
			buses.add(bus);
			break;
		case TRUCK:
			Truck truck = new Truck(regNo, rental, name);
			trucks.add(truck);
			break;
		}
	}
	
	public static boolean checkCategory(String cat) {
		if(!cat.equals("CAR") && !cat.equals("BUS") && !cat.equals("TRUCK")) {
			return false;
		}
		return true;
	}
	
	public static Object findVehicle(int regNo,String cat) {
		if(!VehicleRentingSystem.checkCategory(cat)) {
			System.out.println("Invalid category");
			return null;
		}
		switch(VehicleCategory.valueOf(cat)) {
		case CAR:
			return cars.stream().filter(c->c.registrationNumber==regNo).findAny();
		case BUS:
			return buses.stream().filter(c->c.registrationNumber==regNo).findAny();
		case TRUCK:
			return trucks.stream().filter(c->c.registrationNumber==regNo).findAny();
		}
		return false;
	}
	
	public static void bookVehicle(int regNo,String cat,Vehicle vehicle) {
		
	}
}
