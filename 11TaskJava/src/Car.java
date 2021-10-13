import java.util.List;

public class Car {
    public Order getCurrentOrder() {
        return currentOrder;
    }

    public void setCurrentOrder(Order currentOrder) {
        this.currentOrder = currentOrder;
    }

    private Order currentOrder;
    public Car(String carname) {
        this.name = carname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Driver> getDriverList() {
        return driverList;
    }

    public void setDriverList(List<Driver> driverList) {
        this.driverList = driverList;
    }

    public int getMillage() {
        return millage;
    }

    public void setMillage(int millage) {
        this.millage = millage;
    }

    private String name;
    private List<Driver> driverList;
    private int millage;

    public Car(String name, List<Driver> driverList, int millage) {
        this.name = name;
        this.driverList = driverList;
        this.millage = millage;
    }

    public void addDriver(Driver ivan) {
        this.driverList.add(ivan);
    }

    public void getOrder(Order order) {
        this.currentOrder =  new Order(order);
    }
}
