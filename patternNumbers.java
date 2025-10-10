public class patternNumbers {
       public static void main(String[] args) {
       int n=5 ,rv2=1, rv1=(n*2)-1 ,rval=1 ;
       for(int row=1; row<=n; row++){

        // int cval=rval;
        // boolean b= true;

        // for(int)

        // System.err.println("rv1 value "+rv1+" rv2 value "+rv2);

        int cval= rval;
        boolean b= true;

        for(int col=1; col<=n; col++){
            System.out.print(cval+" ");

            if(b){

                cval+=rv1;
                b=false;
            }
            else{
                cval+=rv2;
                b=true;
            }
        }

        rv1-=2;
        rv2+=2;
        rval+=1;
        System.out.println();

       }

    
    }

}
