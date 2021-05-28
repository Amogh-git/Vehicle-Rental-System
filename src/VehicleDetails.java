import com.rental.utils.IOUtility;

public class VehicleDetails {
	int registrationNumber;
	int rental;
	String vehicleName;
	String category;
	void setValues(){
		System.out.println("Enter registration number");
		this.registrationNumber = IOUtility.getIntegerInput();
		System.out.println("Enter rental price");
		this.rental = IOUtility.getIntegerInput();
		System.out.println("Enter vehicle name");
		this.vehicleName = IOUtility.getStringInput();
		System.out.println("Enter vehicle category");
		this.category = IOUtility.getStringInput().toUpperCase();
	}
	void setValuesForSearch(){
		System.out.println("Enter registration number");
		this.registrationNumber = IOUtility.getIntegerInput();
		System.out.println("Enter vehicle category");
		this.category = IOUtility.getStringInput().toUpperCase();
	}
}
