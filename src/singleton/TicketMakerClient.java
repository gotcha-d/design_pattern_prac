package singleton;

public class TicketMakerClient {
    public static void main() {
        System.out.println("Start");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + ": " + TicketMaker.getInstance().getNextTicketNumber());
        }
        System.out.println("End");
        
    }
}
