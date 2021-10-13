import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstArg = 0;
        int second = 0;
        System.out.println("Etner first argument");
        String firstArgText = scan.next();
        System.out.println("Etner second argument");
        String secondText =scan.next();
        try
        {
            System.out.println("Etner first argument");
            firstArg = Integer.valueOf(firstArgText);
            System.out.println("Etner second argument");
            second = Integer.valueOf(secondText);

        }
        catch (Exception e)
        {
            String [] mas1 = firstArgText.split(",");
            String [] mas2 = secondText.split(",");
            CustumDouble c1 = new CustumDouble(Integer.valueOf(mas1[0]), Double.parseDouble(mas1[1]));
            CustumDouble c2 = new CustumDouble(Integer.valueOf(mas2[0]), Double.parseDouble(mas2[1]));
            System.out.println("What u want to do: (+, -, *, /)");
            String operation = scan.next();

            CustumDouble result = new CustumDouble(0,0);
            double simpleResult = 0;
            if (operation.equals("+"))
            {
                int intg = c1.getIntger() + c2.getIntger();
                double dbl = c1.getaDouble() + c2.getaDouble();
                result = new CustumDouble(intg, dbl);
            }

            if (operation == "-")
            {
                int intg = c1.getIntger() - c2.getIntger();
                double dbl = c1.getaDouble() - c2.getaDouble();
                result = new CustumDouble(intg, dbl);
            }
            if (operation == "*")
            {
                double c1Double = c1.toDouble();
                double c2Double = c2.toDouble();
                simpleResult = c1Double * c2Double;
            }
            if (operation == "/")
            {
                double c1Double = c1.toDouble();
                double c2Double = c2.toDouble();
                simpleResult = c1Double / c2Double;
            }
            if (simpleResult != 0)
            {
                System.out.println(simpleResult);
            }
            else
                System.out.println(result.getIntger() + "," + result.getaDouble());
            return;
        }
        System.out.println("What u want to do: (+, -, *, /");
        String operation = scan.next();
        int result = 0;
        if (operation == "+")
        {
            result = firstArg + second;
        }
        if (operation == "-")
        {
            result = firstArg - second;
        }
        if (operation == "*")
        {
            result = firstArg * second;
        }
        if (operation == "/")
        {
            result = firstArg / second;
        }
        System.out.println(result);
    }
}
