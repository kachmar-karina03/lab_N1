public class Task8 {
    public static void main(String[] args) {
CustumDouble custumDouble = new CustumDouble(3,2.23);
CustumDouble c2 = new CustumDouble(1,1);

CustumDouble sum = custumDouble.sum(custumDouble,c2);
        System.out.println(sum.getIntger() + ", " + sum.getaDouble());

    }
}
