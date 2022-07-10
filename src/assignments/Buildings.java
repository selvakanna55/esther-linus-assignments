package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Buildings {
    public static void main(String[] args) {
        //input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //processing - solve prb
        int maxHeight = 0;
        int buildingsCount = 0;

        for (int i = 0; i < n; i++) {
            if (maxHeight < arr[i]) {
                buildingsCount++;
                maxHeight = arr[i];
            }
        }

        //output
        System.out.println(buildingsCount);


    }
}