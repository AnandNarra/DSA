import java.util.*;
public class Lcm {
    public static void main(String[] args) {

        // int n1 , n2;
        // System.out.println("enter frist number :");
        // Scanner sc = new Scanner(System.in);

        // n1 = sc.nextInt();

        // System.out.println("enter Second number :");
        // n2 = sc.nextInt();
         

        // int a = 2;
        // int b= 3;

        // for (int i =b; i<=(a*b);i++ ){

        //     System.out.println(i);
        //     if (i%a==0 && i%b==0){
        //         System.out.println( "given value is "+i);
        //         break;

        //     }
        // }

        // for(int lcm=Math.max(a,b); lcm <= a*b; lcm++){

        //     if (lcm%a==0 && lcm%b==0) {

        //         System.out.println(lcm);
        //         break;
                
        //     }


        // }

        int n1,n2;
        System.out.print("Enter frist value n1 = ");

        Scanner sc = new Scanner(System.in);

        n1 = sc.nextInt();
        System.out.print("Enter second value n2 = ");
         n2= sc.nextInt();

         for(int i = Math.max(n1, n2); i<=(n1*n2); i++){

            if( i %n1 == 0 && i %n2 == 0 ){

                System.out.println(i);
                break;

            }

         }

        


        




        
    }
}
