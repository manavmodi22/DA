import java.util.Scanner;

public class q8 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float[][] matrix = new float[3][3];
        int i, j;
        int n = s.nextInt();
        for (i = 0; i < n; i++)
            for (j = 0; j < n; j++) {
                System.out.println("Enter the elements:");
                matrix[i][j] = s.nextFloat();
            }
        float[] rowsum = new float[10], columnsum = new float[10];
        float sum;
        for (i = 0; i < n; i++) {
            sum = 0;
            for (j = 0; j < n; j++) {
                sum = sum + matrix[i][j];
            }
            rowsum[i] = sum / n; // Average of column sum
            System.out.println(rowsum[i]2);
        }

        for (i = 0; i < n; i++) {
            sum = 0;
            for (j = 0; j < n; j++) {
                sum = sum + matrix[j][i];
            }
            columnsum[i] = sum / n;
            System.out.println(columnsum[i]); // Average of column sum
        }
        
    }
}