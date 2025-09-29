public class reverseOfNumber {
    public static void main(String[] args) {
        int n = 123;

        // int temp =n;

        int rev = 0;
         while (n>0){
            int ld = n%10;
            rev = rev * 10 +ld;
            n=n/10;

         }

        //  if (temp==rev){
        //     System.out.println("the given number ");
        //  }
        System.out.println(rev);

    }
}
