public class pattern2 {

    public static void main(String[] args) {
        
        int n=9 , st=1 , sp = n/2;

        int half = n/2 +1;

        for(int row =1 ; row <=n; row++){

            // System.out.println("sp"+sp+"st"+st);

            for(int col=1; col<=sp;col++){
                System.out.print(" ");
            }
            for(int col=1; col<=st;col++){
                System.out.print("*");
            }

            
            
            if(row<half){
                st =st+2;
                sp=sp-1;
                
            }
            else{
                
                sp= sp+1;
                st=st-2;
                
                
                
                
                
            }
            System.out.println();
        }

        

        

        
        // System.err.println(half);
    }
    
}
