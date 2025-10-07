package Week7;
import java.util.*;

public class trafficTicketEg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int limit, mph, ticketUnder, ticketOver;
        System.out.print("Enter speed limit: ");
        limit = input.nextInt();
        System.out.print("Enter MPH: ");
        mph = input.nextInt();

        ticketUnder = limit - mph;
        ticketOver = mph - limit;



        if (ticketUnder >= 10) {
            System.out.println("$50 ticket");
        }
        else if (ticketOver >= 6 && ticketOver <= 20) {
            System.out.println("$75 ticket");
        }
        else if (ticketOver >= 21 && ticketOver <= 40) {
            System.out.println("$150 ticket");
        }
        else if (ticketOver >= 41) {
            System.out.println("$300 ticket");
        }
        else {
            System.out.println("No ticket");
        }
    }
}
