public class numberpattren2 {

    public static void main(String[] args) {

        int n=5 ,rval=1;

        for(int row=1; row<=n; row++){

            if(row%2 != 0){        
                for(int col=1; col<=n; col++){
                    System.out.print(rval+" ");
                    rval+=1;
                }
            }
            else{
                rval = (rval +n) -1;
                for(int col=1; col<=n; col++){
                    System.out.print(rval+" ");
                    rval-=1;                    
                }   
                rval = rval + n+1;                
            }
            System.out.println();
        }

       
    }

}
