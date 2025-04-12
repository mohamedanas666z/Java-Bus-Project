package src.bus_reservation.java;
import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Booking {

    String PassangerName;
    int busNo;
    Date date;
    Booking(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the passanger name: ");
        PassangerName = sc.next();
        System.out.println("Enter the Bus NO: ");
        busNo = sc.nextInt();
        System.out.println("Enter the date dd-mm-yyyy: ");
        String dateInput = sc.next();
        SimpleDateFormat dateFomat = new SimpleDateFormat("dd-MM-yyyy");
        try{
        date = dateFomat.parse(dateInput);
        } catch (ParseException e){
            e.printStackTrace();
        }
    }

        public boolean isAvailable(ArrayList<Booking>bookings, ArrayList<Bus>buses){
            int capacity = 0;
            for(Bus bus: buses){
                if(bus.getBusNo() == busNo)
                    capacity = bus.getCapacity();
            }
            int booked = 0;
            for(Booking b: bookings){
            if(b.busNo == busNo && b.date.equals(date)){
                booked++;
            }
        }

        return booked<capacity?true:false;
    }
}
