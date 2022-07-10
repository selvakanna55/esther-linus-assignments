package assignments;

public class Pattern {
    static void Pattern(int N) {
        //first row
        System.out.println("*");

        for (int i = 1; i < N - 1; i++) {
            System.out.print("*");
            for (int j = 0; j < i; j++) {
                System.out.print("^");
            }
            System.out.println("*");
        }

        //last row
        for (int i = 0; i < N + 1; i++) {
            System.out.print("*");
        }
    }
}

