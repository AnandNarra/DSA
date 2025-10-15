public class frequencies {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 2, 3, 3, 5, 5, 8, 8, 8, 9, 9, 10 };

        int n = arr.length;

        int count = 0;
        int j = 0;
        for (int i = 0; i <n; i++) {

            if (arr[i] == arr[j]) {

                count++;

            } else if (arr[i] != arr[j]) {
                System.out.println("frequences in sotred array " + arr[j] + " = " + count);
                j=i;
                count=1;
            }
        }
        System.out.println("frequences in sotred array " + arr[j] + " = " + count);

    }

}
