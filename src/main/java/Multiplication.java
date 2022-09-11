import java.util.Scanner;

public class Multiplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Количество строк первой матрицы, столбцов первой и строк второй, стобцов второй

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int a[][] = new int[n][m];
        int b[][] = new int[m][k];
        int res[][] = new int[n][k];

        for (int i = 0; i < n; i++) // данные первой матрицы
        {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();

            }
        }
        for (int i = 0; i < m; i++)// данные второй матрицы
        {
            for (int j = 0; j < k; j++) {
                b[i][j] = sc.nextInt();

            }
        }

        for (int i = 0; i < n; i++) {
            for (int u = 0; u < k; u++) {
                for (int j = 0; j < m; j++) {

                    res[i][u] += a[i][j] * b[j][u];
                }
            }
        }

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < k; j++) {
                System.out.print(res[i][j] + " ");

            }
            System.out.println();
        }

    }
}

