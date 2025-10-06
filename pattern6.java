public class pattern6 {
    public static void main(String[] args) {
        int n= 7, st=1 , sp=n-st ,half = n/2+1;

        for(int row=1; row<=n;row++){


            System.out.print("stras"+st+"spaces"+sp);

            
            for(int col =1; col<=st;col++){

                System.out.print("*");
            }

            for (int col =1;col<=sp-(half-1);col++){
                System.out.print("-");

            }

            for (int col =1;col<=sp-(half);col++){
                System.out.print("-");

            }

            for(int col =1; col<=st;col++){

                if(col==half){
                    break;
                }

                

                System.out.print("*");
            }

            

            if(row <half){
                st=st+1;
            sp=sp-1;
                
            }
            else{
                st -=1;
                sp+=1;
            }
            

            System.out.println();

        }

        


    }
}
