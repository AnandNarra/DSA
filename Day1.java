// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    
    
    public static void main(String[] args) {
        // int a=5;
        // int count =2;
        // for(int i=2; i<=a ; i++){
            
        //     if(i%2==0){
        //         count=count+1;
        //     }
            
        //     else{
        //         count=count+0;
        //     }
            
            
        // }
        
        // if (count==2){
        //     System.out.println("The given number is prime");
        // }
        // else{
        //     System.out.println("the Given number is not a prime number");
        // }
        int n = 17;
        boolean[] arr = new boolean[n+1];
        Arrays.fill(arr,true);
        arr[0]=false;
        arr[1]=false;
        for(int i=2;i<arr.length;i++)
        {
            
            
            {
                System.out.println(i);
                for(int j=i*2;j<arr.length;j=j+i)
                {
                    arr[j]=false;
                    
                }
            }
            
            
            
            
        }
        
        
    }
}