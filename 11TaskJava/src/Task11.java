public class Task11 {
    public static void main(String[] args) {
        Driver Ivan = new Driver("Ivan", "Petrovich", 440);
        Car taxicar = new Car("Mazda5");
        taxicar.addDriver(Ivan);
        Order order = new Order(21, 330);
        taxicar.getOrder(order);

    }
}
