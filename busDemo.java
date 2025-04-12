package src.bus_reservation.java;
import java.util.Scanner;
import java.util.ArrayList;

public class busDemo {
    public static void main(String[] args){

        //ARRAYLIST
        ArrayList<Bus> buses = new ArrayList<Bus>();
        ArrayList<Booking> bookings = new ArrayList<Booking>();
        buses.add(new Bus(1,true,45));
        buses.add(new Bus(2,false,2));
        buses.add(new Bus(3,true,40));
        buses.add(new Bus(4,false,55));

        
        //LOOPING
        int userOpt = 1;
        Scanner sc = new Scanner(System.in);

        for(Bus b:buses){
            b.displayBusInfo();
        }

        while(userOpt == 1){
            System.out.println("Enter 1 to Book or 2 to Exit");
            userOpt = sc.nextInt();
            if(userOpt == 1){
                Booking booking = new Booking();
                if(booking.isAvailable(bookings,buses)){
                  bookings.add(booking);
                  System.out.println("Your booking is Confirmed...!");  
                }
                else
                    System.out.println("Sorry, the bus is Full. Please try another Bus or date");
            }
        }
    }

}
