public class Order {
    public Order(Order order) {
        this.millageOrder = order.millageOrder;
        this.price = order.price;
    }

    public int getMillageOrder() {
        return millageOrder;
    }

    public void setMillageOrder(int millageOrder) {
        this.millageOrder = millageOrder;
    }

    public Order(int millageOrder, double price) {
        this.millageOrder = millageOrder;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private int millageOrder;
    private double price;
}
