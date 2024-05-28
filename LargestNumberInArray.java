public class LargestNumberInArray {
    public void largestNumberInArray(int arr[]) {

      //  int arr[] = {3,4,5,6,7,9,3,2,2,0};
        int max = arr[0];

        for (int i=0; i<arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Largest number in array is:" + max);
    }

}
