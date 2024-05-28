public class SumOfElementsInArray {
    public void sumOfArray(int arr[]) {

       // int[] arr = new  int[] {3,4,5,6,7,9,3,2,2,0};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of all the elements of an array: " + sum);
    }
}
