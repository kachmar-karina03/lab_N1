import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.function.ToIntFunction;

public class
Task1 {
    public static void main(String[] args) {
        String [] massive = genereteMassiveString();
        Comparator<String> stringLengthComparator = new StringLengthSort();
        for(String str : massive){
            System.out.println(str);
        }
        Arrays.sort(massive, stringLengthComparator); // применяем сортировку
        System.out.println("\nAfter sort:");
        for(String str : massive){
            System.out.println(str);
        }

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
class StringLengthSort implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {
        if(o1.length() > o2.length()){
            return 1;
        }else{
            if(o1.length() < o2.length()){
                return -1;
            }else{
                return 0;
            }
        }
    }
 }