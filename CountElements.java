//Question: given an array count no of elements having atleast one element greater than itself
//Example: int[] arr = {1,2,3,4,5}
//Observation: for every element they wont be any element greater than itself
//Pseudocode:
// Steps:
// 1. Iterate and find max element from array 
// 2. Iterate and get no of elements that are not equal to max
// 3. Increment the counter


public class CountElements {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};

        int max=arr[0];
        for(int i=0;i<arr.length;i++) {
            if(arr[i]> max){
                max = arr[i];
            }
        }

        System.out.println(max);

        int count=0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]< max){
                count ++;
            }
        }

        System.out.print("Count of elements greater than itself: " + count);


    }
}
