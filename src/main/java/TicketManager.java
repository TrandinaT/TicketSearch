import java.util.Arrays;

public class TicketManager {
    protected TicketRepository rep;

    public TicketManager(TicketRepository rep) {
        this.rep = rep;
    }

    public void add(Ticket product) {
        rep.add(product);
    }

    public Ticket[] searchBy(String from) {
        Ticket[] result = new Ticket[0]; // тут будем хранить подошедшие запросу продукты
        for (Ticket product : rep.findAll()) {
            if (matches(product, from)) {
                Ticket[] tmp = new Ticket[result.length + 1];
                for (int i = 0; i < result.length; i++) {
                    tmp[i] = result[i];
                }
                tmp[tmp.length - 1] = product;
                result = tmp;
            }

        }
        Arrays.sort(result);
        return result;
    }

    // метод определения соответствия товара product запросу search
    public boolean matches(Ticket product, String search) {
        if (product.getFrom().contains(search)) {
            return true;
        } else {
            return false;
        }
        // или в одну строку:
        // return product.getName().contains(search);
    }
}
