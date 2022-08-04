public class Ticket implements Comparable<Ticket> {
    private int id;
    private String from;
    private String to;
    private int time;
    private int price;

    public Ticket(int id, String from, String to, int price, int time) {
        this.setId(id);
        this.setFrom(from);
        this.setPrice(price);
        this.setTo(to);
        this.setTime(time);
    }






    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(Ticket o) {
        return getPrice() - o.getPrice();
    }
}