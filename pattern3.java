public class pattern3 {

    public static void main(String[] args) {
        int n = 7, sp = 0, st = n, half = n / 2 + 1;

        for (int row = 1; row <= n; row++) {
            // System.out.println("spaces"+sp+"stars"+st);

            for (int col = 1; col <= sp; col++) {

                System.out.print(" ");
            }

            for (int col = 1; col <= st; col++) {
                System.out.print("*");
            }

            if (row < half) {

                st = st - 2;
                sp += 1;
            } 

            
            
            else {
                st = st + 2;
                sp -= 1;
            }
            System.out.println();

        }
    }

}
