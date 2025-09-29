import java.util.*;

public class Toggle {

    public static void main(String[] args) {
          int n , pos;
    System.out.println("Enter the values of n , pos");
     
    Scanner sc = new Scanner(System.in);

    n = sc.nextInt();
    pos = sc.nextInt();

    int bm = 1<<(pos-1);

    

    n = n^ (bm);
    n = n^ (bm);
    System.err.println("the out is "+n);
    }
    
}
