public class pattern5 {
    public static void main(String[] args) {
        // int n =4, st=1, sp=n-st;

        // for(int row=1; row <=n; row++){

        //     // System.out.println("stars"+st+" "+"spaces"+sp);

        //     int rval=1;

        //     for(int col=1; col<=st; col++){
        //         System.out.print(rval);
        //         rval+=1;
        //     }

        //     for(int col =1; col <= sp; col++){

        //         System.out.print("-");
        //     }
        //     for(int col =1; col <= sp-1; col++){

        //         System.out.print("-");
        //     }

        //     if(row==n)
        //     {
        //         st=st-1;
        //     }
        //     for(int col=1; col<=st; col++){

              
        //         System.out.print(rval-1);
        //         rval-=1;
                
        //     }

        //     st+=1;
        //     sp-=1;
        //     System.out.println();
        // }
    
        int n=4, st1=1, sp=(n*2)-2-1 , st2=1;

        for(int row =1; row<=n; row++){

            int rval=1;
            int x= st2;

            // System.out.println("st1 = "+st1+" spaces ="+sp+" st2 = "+st2);

            for(int col=1; col<=st1; col++){
                System.out.print(rval+" ");
                rval+=1;
            }

            for(int col=1; col<=sp; col++){
                System.out.print("- ");
            }

            
            for(int col=1; col<=st2; col++){

                System.out.print(x+" ");
                x-=1;
            }

            st1+=1;
            sp-=2;
            st2+=1;
            System.out.println();

            
            }

            
        }


    }
