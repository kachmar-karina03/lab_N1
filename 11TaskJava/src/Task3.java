import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        String symbol = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string:");
        symbol = scan.next();
        toMassive(symbol);


    }

    private static void toMassive(String symbol) {
        List<Integer> masiveInteger = new ArrayList<>();
        List<Character> massiveChar = new ArrayList<>();
        char [] text = symbol.toCharArray();
        for (int i = 0; i < text.length; i++) {
            String letter = String.valueOf(text[i]);
            try {
                int a = Integer.parseInt(String.valueOf(letter));
                masiveInteger.add(a);
                continue;

            }
            catch (Exception e)
            {
                char word = text[i];
                massiveChar.add(Character.valueOf(word));
                continue;
            }



        }
        System.out.println("Data in char massive:\n");
        for (Character ch :
                massiveChar) {
            System.out.println(ch);
        }

        System.out.println("Values in integer massive:\n");
        for (Integer it :
                masiveInteger) {
            System.out.println(it);
        }
    }
}
