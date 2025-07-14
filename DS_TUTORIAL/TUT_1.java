package DS_TUTORIAL;
import java.util.Scanner;
public class TUT_1 {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter size of 1D array: ");
        int n = sc.nextInt();
        int[] arr1D = new int[n];
        System.out.println("enter elements of 1D array: ");
        input1D(arr1D);
        System.out.println("1D Array: ");
        print1D(arr1D);
        System.out.println("enter size of 2D array: ");
        int p = sc.nextInt();
        int q = sc.nextInt();
        int[][] arr2D = new int[p][q];
        System.out.println("enter elements of 2D array: ");
        input2D(arr2D);
        System.out.println("2D Array: ");
        print2D(arr2D);
        System.out.println("Transpose of 2D Array: ");
        int[][] transposed_arr = transpose2D(arr2D);
        print2D(transposed_arr);
    }

    public static void print1D(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void print2D(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void input1D(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void input2D(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public static int[][] transpose2D(int[][] arr) {
        int[][] transpose = new int[arr[0].length][arr.length];
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                transpose[j][i] = arr[i][j];
            }
        }

        return transpose;
    }   
}