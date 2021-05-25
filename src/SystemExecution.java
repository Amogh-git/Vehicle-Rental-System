import java.util.*;
public class SystemExecution {

	static int choice;
	public static void main(String[] args) {
		
		
		
		do
		{
			VehicleRentingSystem.ioObject.displayMenu();
			choice = VehicleRentingSystem.ioObject.getIntegerInput();
			switch(choice) {
			case 1:
				int regNo = VehicleRentingSystem.ioObject.getRegNo();
				String name = VehicleRentingSystem.ioObject.getname();
				int rental = VehicleRentingSystem.ioObject.getRental();
				String cat = VehicleRentingSystem.ioObject.getCategory();
				if(VehicleRentingSystem.checkCategory(cat))
				{
					VehicleRentingSystem.addVehicle(regNo, rental, name, cat);
					System.out.println("Vehicle added !");
				}
				else
					System.out.println("Unable to add vehice :(, Invalid category");
					break;
			case 2:
				regNo = VehicleRentingSystem.ioObject.getRegNo();
				cat = VehicleRentingSystem.ioObject.getCategory();
				Optional v = (Optional) VehicleRentingSystem.findVehicle(regNo, cat);
				if(v!=null && v.isPresent())
				{
					System.out.println("Vehicle found "+v.get());
				}
				else {
					System.out.println("Vehicle not found");
				}
			case 3:
				regNo = VehicleRentingSystem.ioObject.getRegNo();
				cat = VehicleRentingSystem.ioObject.getCategory();
				v = (Optional) VehicleRentingSystem.findVehicle(regNo, cat);
				if(v!=null && v.isPresent())
				{
					System.out.println("Vehicle found "+v.get());
				}
				else {
					System.out.println("Vehicle not found");
				}
				
			}
		}while(choice<5);
	}

}
