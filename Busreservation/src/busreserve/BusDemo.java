package busreserve;
import java.util.Scanner;
import java.util.ArrayList;
public class BusDemo {

	public static void main(String[] args) {
		
		ArrayList <Bus> buses=new ArrayList<Bus>();
		ArrayList <Booking> bookings=new ArrayList <Booking>();
		
		
		buses.add(new Bus(1,true,2));
		buses.add(new Bus(2,false,50));
		buses.add(new Bus(3,true,48));
		
		int useropt=1;
		Scanner scanner=new Scanner(System.in);
		
		for(Bus b:buses) {
			b.displayBusInfo();
		}
		while(useropt==1) {
			System.out.println("enter 1 to book and 2 to exit");
			useropt=scanner.nextInt();
			if(useropt==1) {
				Booking booking=new Booking();
				if(booking.isAvailable(bookings,buses)) {
					bookings.add(booking);
					System.out.println("Your Booking Is Confirmed");
				}
				else
					System.out.println("Sorry...The Bus Is Full");
			}
	}
		

	}

}
