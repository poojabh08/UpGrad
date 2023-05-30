public class Nested {
    public static void main(String[] args) {
       boolean ticketAvailable = false;

       if(ticketAvailable == true){
           int ticketPrice = 700;
           if(ticketPrice < 400){
               System.out.println("Booking movie ticket!");
           }
           else{
               System.out.println("No booking for now...");
           }
       }
       else{
           System.out.println("Ticket not available!");
       }
    }
}