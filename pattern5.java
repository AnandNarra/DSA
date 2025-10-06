public class pattern5 {
    public static void main(String[] args) {
        int n =3, st=1, sp=n-st;

        for(int row=1; row <=n; row++){

            // System.out.println("stars"+st+" "+"spaces"+sp);

            for(int col=1; col<=st; col++){
                System.out.print("*");
            }

            for(int col =1; col <= sp; col++){

                System.out.print("-");
            }
            for(int col =1; col <= sp-1; col++){

                System.out.print("-");
            }

            for(int col=1; col<=st; col++){

                if(col==n){
                    break;
                }
                System.out.print("*");
            }

            st+=1;
            sp-=1;
            System.out.println();
        }
    }
}
