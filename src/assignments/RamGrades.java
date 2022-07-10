package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class RamGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int percentage = ((a + b + c + d) * 100) / 400;
        // int percentage = ((a+b+c+d)/400)*100;
        System.out.println(percentage);
    }
}