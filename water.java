public class water {

    public static void main(String[] args) {
        
        int arr[] ={1,8,6,2,5,4,8,3,7};
        int max = Integer.MIN_VALUE;

        int n=arr.length;

        int si = 0;
        int ei = n - 1;
        

     
        while (si < ei) {
            int ht = Math.min(arr[si], arr[ei]);
            int dis = ei - si;
            int curr = ht * dis;
            if (curr > max) {
                max = curr;
            }
            if (arr[si] < arr[ei]) {
                si++;
            } else {
                ei--;
            }
        }
     System.out.println(max);
    }

    
}
