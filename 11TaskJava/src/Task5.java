import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int [][] a = initMatrice();
        int n = a.length;

        // часть 2 - выводит на экран начальную матрицу
        System.out.println("Before transporated");
        System.out.println("------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", a[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }


        System.out.println();
        System.out.println("Transporated matrice");
        System.out.println("------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d", a[i][j]);
            }
            System.out.println();
        }
    }

    private static int[][] initMatrice() {
        Scanner scan = new Scanner(System.in);
        int n = 0;
        System.out.println("Enter size:");
        n = scan.nextInt();
        int [][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = n*i + j;
            }
        }
        return a;
    }
}
