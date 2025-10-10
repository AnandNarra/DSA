public class pattrenChar {

     public static void main(String[] args) {
        
        int n=7, half= (n/2)+1;

        for(int r=1; r<=n; r++){

            for(int c=1; c<=n; c++){

                if((c==1&&r<=n)|| (c==n&& r<=n) || (r==half && c==half) || (r==half+1 &&( (c==half-1) || (c==half+1))) || (r==half+2 && ((c==half-2)|| (c==half+2))) ){

                    System.out.print("* ");

                }
                else{
                     System.out.print("  ");
                }

                
            }
            System.out.println();
        }
    }

    
    
}
