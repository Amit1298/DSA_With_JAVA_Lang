import java.util.Scanner;

public class Arr1 {
    static int findElement(int[] arr, int[][] ranges,
                           int rotations, int index)
    {
        for (int i = rotations - 1; i >= 0; i--) {

            // Range[left...right]
            int left = ranges[i][0];
            int right = ranges[i][1];

            // Rotation will not have any effect
            if (left <= index && right >= index) {
                if (index == left)
                    index = right;
                else
                    index--;
            }
        }

        // Returning new element
        return arr[index];
    }
    public static void main(String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
//        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println("size of array");
        int n = sc.nextInt();
        System.out.println("Array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        // No. of rotations
        System.out.println("Rotation");
        int rotations = sc.nextInt();

        // Ranges according to 0-based indexing
//        int[][] ranges = { { 0, 2 }, { 0, 3 } };
        System.out.println("Ranges");
        System.out.println("row");
        int p = sc.nextInt();
        System.out.println("column");
        int q = sc.nextInt();
        int[][] ranges = new int[p][q];
        System.out.println("rangeees");
        for (int k = 0; k < p; k++) {
            for (int j = 0; j < q; j++) {
                ranges[k][j] = sc.nextInt();
            }
        }
        System.out.println("Index");
        int index = 1;
        System.out.println(findElement(arr, ranges,
                rotations, index));
    }
}


