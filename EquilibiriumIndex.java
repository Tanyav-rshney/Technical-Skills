public class EquilibiriumIndex {
    public static void main(String[] args) {
        int arr[] = {-1, 1, -1};
        int n = arr.length;
        int pf [] = new int[n];
        pf[0] = arr[0];
        for(int i = 1; i < n; i++){
            pf[i] = arr[i]+pf[i-1];
        }
        int count = 0;
        for(int i = 0; i < n; i++){
            int leftSum = 0;
            if(i == 0){
                leftSum = 0;
            }else{
                leftSum = pf[i-1];
            }

            int rightSum = pf[n-1]-pf[i];

            if(leftSum == rightSum){
                count++;
            }
        }
        System.out.println(count);
        

    }
}