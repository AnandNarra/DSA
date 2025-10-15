import java.util.ArrayList;

public class Leads_in_array {

    public static void main(String[] args) {
        
        int[] arr={16,17,4,3,5,2};

        int n=arr.length;
        int lg=arr[n-1];
        ArrayList<Integer>al=new ArrayList<>();
        al.add(arr[n-1]);

        for(int i=n-2; i>0; i--){
         
            if(arr[i]>lg){

                al.add(arr[i]);
                lg=arr[i];

            }



        }

        System.out.println(al);
    }
    
}
