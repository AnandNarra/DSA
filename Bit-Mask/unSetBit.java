import java.util.*;

public class unSetBit {

    public static void main(String[] args) {
        int n , pos;
    System.out.println("Enter the values of n , pos");
     
    Scanner sc = new Scanner(System.in);

    n = sc.nextInt();
    pos = sc.nextInt();

    int bm = 1<<(pos-1);

    

    int temp = n& (~bm);
    System.err.println("the out is "+temp);
    }
    
}
