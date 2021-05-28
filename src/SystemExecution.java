import com.rental.utils.IOUtility;
public class SystemExecution {

	public static void main(String[] args) {
		int choice;
		do
		{
			IOUtility.displayMenu();
			choice = IOUtility.getIntegerInput();
			switch(choice) {
			case 1:
				VehicleDetails v = new VehicleDetails();
				v.setValues();
				try {
					VehicleRentingSystem.addVehicle(v);
					System.out.println("Vehicle added successfully !!");
				} catch (Exception e) {
					System.out.println("Coudn't add vehicle "+e.getMessage());
				}
				break;
			case 2:
				v = new VehicleDetails();
				v.setValuesForSearch();
				try {
					System.out.println(VehicleRentingSystem.findVehicle(v));
				} catch (Exception e) {
					System.out.println("Vehicle not found "+e.getMessage());
				}
				break;
			case 3:
				v = new VehicleDetails();
				v.setValuesForSearch();
				try {
					VehicleRentingSystem.bookVehicle(v);
				} catch (Exception e) {
					System.out.println("Unable to book !! "+e.getMessage());
				}
				break;
			case 4:
				v = new VehicleDetails();
				v.setValuesForSearch();
				try {
					VehicleRentingSystem.unbookVehicle(v);
				} catch (Exception e) {
					System.out.println("Unable to unbook !! "+e.getMessage());
				}
				break;
			}
		}while(choice<5);
	}

}
