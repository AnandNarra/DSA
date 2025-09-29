public class Palindrom {

    public static void main(String[] args) {
        int n = 121;
        int temp =n;
         int rev= 0 ;
          while (n>0) {
            int lastdigit = n%10;
            rev =rev *10+ lastdigit;
            n=n/10;
          }

          if(temp == rev){
            System.out.println("the given number is a palindron number");
          }
          else{
            System.out.println("the given number is not a palindrom number ");
          }
    }
}