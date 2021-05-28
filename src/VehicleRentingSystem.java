import java.util.*;

import com.rental.enums.*;
import com.rental.utils.IOUtility;
public class VehicleRentingSystem {

	static ArrayList<Car> cars = new ArrayList<Car>();
	static ArrayList<Bus> buses = new ArrayList<Bus>();
	static ArrayList<Truck> trucks = new ArrayList<Truck>();

	public static void addVehicle(VehicleDetails v) throws Exception {	
		switch(VehicleCategory.valueOf(v.category)) {
		case CAR:
			Car car = new Car(v.registrationNumber, v.rental, v.vehicleName);
			cars.add(car);
			break;
		case BUS:
			Bus bus = new Bus(v.registrationNumber, v.rental, v.vehicleName);
			buses.add(bus);
			break;
		case TRUCK:
			Truck truck = new Truck(v.registrationNumber, v.rental, v.vehicleName);
			trucks.add(truck);
			break;
		}
	}
	
	
	public static Vehicle findVehicle(VehicleDetails v) throws Exception {
		switch(VehicleCategory.valueOf(v.category)) {
		case CAR:
			return cars.stream().filter(c->c.registrationNumber==v.registrationNumber).findAny().orElseThrow();
		case BUS:
			return buses.stream().filter(c->c.registrationNumber==v.registrationNumber).findAny().orElseThrow();
		case TRUCK:
			return trucks.stream().filter(c->c.registrationNumber==v.registrationNumber).findAny().orElseThrow();
		}
		return new Vehicle();
	}
	
	
	
	public static void bookVehicle(VehicleDetails v) throws Exception {
		Vehicle vehicle = VehicleRentingSystem.findVehicle(v);
		System.out.println(vehicle+"\nEnter time to book vehicle ");
		SlotTiming time = SlotTiming.valueOf(IOUtility.getStringInput().toUpperCase());
		if(!vehicle.availabilityDetails.get(time))
			System.out.println("Vehicle in this slot already booked ");
		else
		{
			vehicle.availabilityDetails.put(time, false);
			System.out.println("Vehicle booked at "+time);
		}
		
	}
	
	public static void unbookVehicle(VehicleDetails v) throws Exception {
		Vehicle vehicle = VehicleRentingSystem.findVehicle(v);
		System.out.println(vehicle+"\nEnter time to free vehicle ");
		SlotTiming time = SlotTiming.valueOf(IOUtility.getStringInput().toUpperCase());
		if(vehicle.availabilityDetails.get(time))
			System.out.println("Vehicle in this slot already available ");
		else
		{
			vehicle.availabilityDetails.put(time, true);
			System.out.println("Vehicle unbooked at "+time);
		}
	}
}
