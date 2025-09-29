public class sumOfNatural {
    public static void main(String[] args) {
        int n=3;
        int sum=0;
        // method 1;
        // for(int i=1; i<=n; i++){

        //     sum +=i;
        // }

        //method -2;
        // for (int i=1; i<=n; i++){
        //     // sum -=i;
        //     for (int j=i; j<=i; j++){
        //         sum += j;
        //     }
        // }

        sum=n*(n+1)/2; // method 3

        System.out.println( sum);
    }
}
