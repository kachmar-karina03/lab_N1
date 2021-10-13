import java.util.Objects;

public class CustumDouble {
    public int getIntger() {
        return intger;
    }

    public CustumDouble(int intger, double aDouble) {
        this.intger = intger;
        this.aDouble = aDouble;
    }

    public void setIntger(int intger) {
        this.intger = intger;
    }

    public double getaDouble() {
        return aDouble;
    }

    public void setaDouble(double aDouble) {
        this.aDouble = aDouble;
    }

    private int intger;
    private double aDouble;

public CustumDouble sum(CustumDouble c1, CustumDouble c2)
{
    int intg = c1.intger + c2.intger;
    double dub = c1.aDouble + c2.aDouble;
    return new CustumDouble(intg,dub);
}
    public CustumDouble subvinse(CustumDouble c1, CustumDouble c2)
    {
        int intg = c1.intger - c2.intger;
        double dub = c1.aDouble - c2.aDouble;
        return new CustumDouble(intg,dub);
    }
    public boolean equals(CustumDouble c1, CustumDouble c2)
    {
        boolean equals = false;
        if (c1.aDouble == c2.aDouble && c1.intger == c2.intger)
            equals = true;
        return equals;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustumDouble that = (CustumDouble) o;
        return intger == that.intger &&
                Double.compare(that.aDouble, aDouble) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(intger, aDouble);
    }
    public double toDouble()
    {
        return Double.parseDouble(intger + "," +aDouble);
    }
}
