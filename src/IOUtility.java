import java.util.Scanner;

public class IOUtility {

	Scanner s = new Scanner(System.in);
	public void displayMenu() {
		System.out.println("1.Add a vehicle\n2.Find a vehicle\n3.Book a vehicle.\n4.Unbook a vehicle.\n5.Exit\nEnter your choice");
	}
	public int getIntegerInput() {
		return s.nextInt();
	}
	public int getRegNo() {
		System.out.println("Enter Reg No");
		return s.nextInt();
	}
	public int getRental() {
		System.out.println("Enter rental of vehicle");
		return s.nextInt();
	}
	public String getname() {
		System.out.println("Enter name of vehicle");
		return s.next();
	}
	public String getCategory() {
		System.out.println("Enter category");
		return s.next().toUpperCase();
	}
}
