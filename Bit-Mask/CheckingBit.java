import java.util.*;

class CheckingBit{
 public static void main(String[] args) {
    int n , pos;
    System.out.println("Enter the values of n , pos");
     
    Scanner sc = new Scanner(System.in);

    n = sc.nextInt();
    pos = sc.nextInt();

    int bm = 1<<(pos-1);

    int temp = n&bm;

    if (temp ==0){
       
        System.out.println("it is the off bit (or) 0 bit");
    }

    else{
        System.err.println("it is the on bit (or) 1 bit");
    }

 }
    
}
