public class numberpattren1 {

    public static void main(String[] args) {
        
        int n=4, rval=1;

        for(int row=1; row<=n;row++){

            int cval=rval;
            for(int col=1; col<=n; col++){
                System.out.print(cval+" ");
                cval+=n;
            }
            rval+=1;
            System.out.println();
        }
    }
    
}
