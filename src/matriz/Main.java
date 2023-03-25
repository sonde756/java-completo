package matriz;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cout = 0;

        int n = sc.nextInt();

        int[][] m = new  int[n][n];


        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n ; j++) {

                m[i][j] = sc.nextInt();

                if (m[i][j] < 0){
                    cout++;
                }
            }
        }

        System.out.println();
        System.out.print("Main diagonal: ");
        for (int i = 0; i < n; i++) {
            System.out.print(m[i][i]+" ");
        }

        System.out.println();

        System.out.println("Negative numbers = "+cout);


    }
}
