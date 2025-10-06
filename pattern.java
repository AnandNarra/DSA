public class pattern {

    public static void main(String[] args) {
        
        int n=3 , st=1, sp= n-st;

        for( int row =0; row < n; row++){

            // System.out.println("stars"+st+"spaces"+sp);

            for(int col =1 ; col <=sp; col++){

                System.out.print(" ");
            }

            for(int col =1 ;col <=st; col++){

                System.out.print("*");
            }

            st= st+2;
            sp--;

            System.out.println();
        }

        

        
    }
    
}
