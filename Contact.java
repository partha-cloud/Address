package Address;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Contact {
	static List listing = new ArrayList();
	public static Scanner sc = new Scanner(System.in);
	static Contact addressBook = new Contact(null, null, null, null, null, null, null, null, null);
	static  final int i=0;
	 public Contact(String fn, String ln, String add, String city, String state, String zip, String country, String mob,
			String mail) {
		// TODO Auto-generated constructor stub
	}

	public void addContact() {
		System.out.println("Enter how many persons you want to add");
		int numOfPerson=sc.nextInt();
	    for(int i=0; i<=numOfPerson; i++)
	    {
	    	System.out.println("\nPerson :  "+i+" Enter First Name");
	        String fn= sc.next();
	        sc.nextLine();
	        System.out.println("Person : " +i+ " Enter Last Name");
	        String ln = sc.next();
	        sc.nextLine();
	        System.out.println("Person : " +i+ " Enter Address");
	        String add = sc.next();
	        sc.nextLine();
	        System.out.println("Person : " +i+ " Enter City");
	        String city = sc.nextLine();
	        System.out.println("Person : " +i+ " Enter State");
	        String state = sc.next();
	        sc.nextLine();
	        System.out.println("Person : " +i+ " Enter postal_Code");
	        String zip = sc.next();
	        System.out.println("Person : " +i+ " Enter Country_Name");
	        String country = sc.next();
	        System.out.println("person :" +i+ "Enter Mobile number");
	        String mob=sc.next();
	        System.out.println("Person : " +i+ " Enter E-mail");
	        String mail = sc.next();
	        Contact contact1 = new Contact(fn, ln, add, city, state, zip,country,mob, mail);
	        Object contact = null;
			listing.add(contact);
	          
	    }
	   
}
	   
public static void main(String args[]) {
	
	addressBook.addContact();	
	System.out.println("--------The person records are listed below:--------\n");
	System.out.println(listing);
	System.out.println("\n contacts added sccessfully");
	}
}