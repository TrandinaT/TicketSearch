import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TicketManagerTest {


    TicketRepository rep = new TicketRepository();
    TicketManager manager = new TicketManager(rep);
    Ticket ticket1 = new Ticket(1, "Moscow", "Samara", 900, 130);
    Ticket ticket2 = new Ticket(2, "Kazan", "Moscow", 700, 160);
    Ticket ticket3 = new Ticket(3, "Kazan", "Samara", 700, 90);

    Ticket ticket4 = new Ticket(4, "Penza", "Samara", 1000, 100);


    @Test
    public void Moscow() {

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        Ticket[] actual = manager.searchBy("Kazan");
        Ticket[] expected = {ticket2,ticket3};
        assertArrayEquals(expected, actual);

    }
    @Test
    public void Moscow1() {
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        ticket1.compareTo(ticket2);

    }

}
