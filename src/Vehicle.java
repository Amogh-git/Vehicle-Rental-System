import java.util.*;
import enums.*;
public class Vehicle {
	int registrationNumber,rental;
	String vehicleName;
	HashMap<SlotTiming, Boolean> availabilityDetails = new HashMap<SlotTiming, Boolean>();
	Vehicle(int registrationNumber, int rental, String vehicleName){
		this.registrationNumber = registrationNumber;
		this.vehicleName = vehicleName;
		this.rental = rental;
		this.availabilityDetails.put(SlotTiming.MORNING, true);
		this.availabilityDetails.put(SlotTiming.AFTERNOON, true);
		this.availabilityDetails.put(SlotTiming.EVENING, true);
		this.availabilityDetails.put(SlotTiming.NIGHT, true);
		
	}
	@Override
	public String toString() {
		return "Vehicle [registrationNumber=" + registrationNumber + ", rental=" + rental + ", vehicleName="
				+ vehicleName + ", availabilityDetails=" + availabilityDetails + "]";
	}
	
}
