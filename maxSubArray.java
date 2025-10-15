public class maxSubArray {

    public static void main(String[] args) {
        int arr[]={3,1,-2,2};
        int n=arr.length;
        int currSum = 0;
        int maxVal = Integer.MIN_VALUE;
       
int a=0;
int b=0;
        for(int i=0;i<n;i++){

            currSum+=arr[i];

            if(currSum > maxVal){
                maxVal=currSum;
                 b+=1;
            }

            if(currSum<0){
                currSum=0;
                int strat=i;
                int end = i;
                a=strat+1;
                b=end+1;
            }
            
            

            
        }

        System.out.println(maxVal);
    System.out.println(a+" "+b);
    }
    
}
