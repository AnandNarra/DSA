public class star2 {
    public static void main(String[] args) {

        int n = 5, st = 1, sp = (n * 2) - 1, st2 = 1;

        for (int row = 1; row <= (n * 2) + 1; row++) {

            

            

            // System.out.print("st "+st+" sp "+ sp+" st2 "+st2);
            int rval = n;
            for (int col = 1; col <= st; col++) {

                System.out.print(rval + " ");
                rval--;

            }

            for (int col = 1; col <= sp; col++) {

                System.out.print("  ");
            }

            if (row == n + 1) {

                rval = 1;



            } else {
                rval++;

            }

            for (int col = 1; col <= st2; col++) {

                if(col==n+1){
                    break;
                }



                System.out.print(rval + " ");
                rval++;
            }

            if (row <= n) {
                st++;
                sp -= 2;
                st2++;
            } 

            
            
            else {

                st--;
                sp += 2;
                st2--;

            }

            System.out.println();
        }
    }

}
