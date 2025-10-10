public class pattrenChar1 {
    public static void main(String[] args) {
        
        int n= 7, half= (n/2) +1;

        for(int r=1; r<=n; r++){
            for(int c=1; c<=n; c++){

                if(((r==1 || r==n)&& c==half) || ((r==2 || r==half+2) &&((c==half-1)||(c==half+1))) || ((r==3 || r==half+1 )&& ((c==half-2)||(c==half+2))) || (r==half &&(c==1 || c==n))  ){

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
