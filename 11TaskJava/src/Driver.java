import java.util.Objects;

public class Driver {
    public String getName() {
        return name;
    }

    public Driver(String name, String surname, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private  String name;
    private String surname;
    private double salary;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return Double.compare(driver.salary, salary) == 0 &&
                name.equals(driver.name) &&
                surname.equals(driver.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, salary);
    }
}
