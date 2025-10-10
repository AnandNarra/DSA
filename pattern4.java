public class pattern4 {
    public static void main(String[] args) {

        int n = 4, st = 1, sp = n - st;

        for (int row = 1; row <= n; row++) {

            // System.out.println("stars"+st+"spaces"+sp);
            int rval = 1;
            for (int col = 1; col <= st; col++) {

                System.out.print(rval);
                rval++;
            }

            for (int col = 1; col <= sp; col++) {
                System.out.print("-");
            }
            for (int col = 1; col <= sp; col++) {
                System.out.print("-");
            }
            for (int col = 1; col <= st; col++) {

                System.out.print(rval - 1);
                rval-=1;
            }
            st += 1;
            sp -= 1;

            System.out.println();
        }
    }
}
