package singleton;

public class TicketMaker {

    private int ticket = 100;
    private static TicketMaker ticketMaker = new TicketMaker();

    private TicketMaker() {
        System.out.println("インスタンス生成");
    }
    
    public static TicketMaker getInstance() {
        return ticketMaker;
    }

    public synchronized int getNextTicketNumber() {
        return ticket++;
    }
}
