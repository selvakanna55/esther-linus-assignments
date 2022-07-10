package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class PairEmUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int maxiumPairSum = 0;
        for (int i = 0; i < n / 2; i++) {
            int psum = arr[i] + arr[n - i - 1];
            if (psum > maxiumPairSum) {
                maxiumPairSum = psum;
            }
        }
        System.out.println(maxiumPairSum);
    }
}