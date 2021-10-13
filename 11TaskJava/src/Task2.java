import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String symbol = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter letter:");
        symbol = scan.next();
        String[] massive = genereteMassiveString();
        findCount(massive, symbol);


    }

    private static void findCount(String[] massive, String symbol) {
        int cnt = 0;

        for (int i = 0;i < massive.length; i++) {
            char [] mas_w = massive[i].toCharArray();
            for (int j = 0; j < mas_w.length; j++) {
                if (String.valueOf(mas_w[j]).equals(symbol)){
                    cnt++;
                }
            }
        }
        System.out.println("Count of symbol " + symbol + " , is: " + cnt);
    }




    private static String[] genereteMassiveString() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a size of array:");
        int size = scan.nextInt();
        String [] massive = new String[size];
        scan.reset();
        System.out.println("\nEnter an elements massive:");
        for (int i = 0; i < massive.length; i++) {
            massive[i] = scan.next();
        }
        return massive;

    }
}
