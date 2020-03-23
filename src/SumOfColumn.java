import sun.awt.X11.XFocusProxyWindow;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfColumn {
    public static int sumColumn(int number, int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (j == number) {
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap vao so luong dong: ");
        int dim1 = input.nextInt();

        System.out.print("Nhap vao so luong cot: ");
        int dim2 = input.nextInt();

        int[][] array = new int[dim1][dim2];
        for (int i = 0; i < dim1; i++) {
            for (int j = 0; j < dim2; j++) {
                System.out.printf("Nhap vao phan tu thu [%d][%d] : ", i, j);
                array[i][j] = input.nextInt();
            }
        }

        System.out.println("Mang vua nhap la: ");
        for (int i = 0; i < dim1; i++) {
            for (int j = 0; j < dim2; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.print("Nhap vao cot muon tinh tong: ");
        int toSumColumn = input.nextInt();

        int sumOfColumn = sumColumn(toSumColumn, array);

        System.out.printf("Tong cua cot %d la %d", toSumColumn, sumOfColumn);
    }
}
