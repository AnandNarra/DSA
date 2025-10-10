public class star {

    public static void main(String[] args) {

        int n=5 ,st1=1, sp=(n*2)-3, st2=1;

        int rval=1;

        for(int row=1; row<=n; row++){

            //  System.out.println("st1 "+ st1+" st2 "+st2);

             rval=st1;
             for(int col=1; col<=st1; col++){

                System.out.print(rval+" ");
                rval--;
             }

             for(int col=1; col<=sp; col++){

                System.out.print("  ");
             }

             int c=1;

            if(row==n){

                c+=1;
                st2-=1;
            }

             for(int col=1; col<=st2; col++){
    
                System.out.print(c+" ");
                c++;
             }

            

           


            st1+=1;
            sp-=2;
            st2+=1;
            System.out.println();
        }

        
    }
    
}
