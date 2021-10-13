import java.util.Scanner;

public class Task6 {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Etner a cnt str matrice");
            int n=sc.nextInt();// Количество строк первой матрицы
            System.out.println("Enter cnt colums in matrice");
            int m=sc.nextInt();
            // Количество столбцов в первой матрице и количество строк во второй матрице
            System.out.println("Enter a cnt str in second matrice and cnt colums in first matrice");
            int k=sc.nextInt();
            int Maze[][]=new int[n][m];
            int Maze1[][]=new int[m][k];
            int Maze2[][]=new int[n][k];
            System.out.println("Fill first matrice:");
            for(int i=0;i<n;i++)// Вводим данные первой матрицы
            {
                for(int j=0;j<m;j++)
                {
                    Maze[i][j]=sc.nextInt();

                }
            }
            System.out.println("Fill second matrice");
            for(int i=0;i<m;i++)// Вводим данные второй матрицы
            {
                for(int j=0;j<k;j++)
                {
                    Maze1[i][j]=sc.nextInt();

                }
            }

            for(int i=0;i<n;i++)
            {
                for(int u=0;u<k;u++)
                {
                    for(int j=0;j<m;j++)
                    {

                        Maze2[i][u]+=Maze[i][j]*Maze1[j][u];
                    }
                }
            }
            System.out.println("Multiplication result:");
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<k;j++)
                {
                    System.out.print(Maze2[i][j]+" ");

                }
                System.out.println();
            }

        }
    }



