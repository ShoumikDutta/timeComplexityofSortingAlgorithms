public class SelectionSort {
    public static void Sort(int[] arr) {
        /*
         * first find the min in array and store it in the left most index
         * first loop starts from 0 than arr[0] is sorted after first itaration so start from 1
         * nested loop- outer loop controls the  minindex and inner loop goes through the rightarry and looks for min value
         *first the outer loop points to the index that we will swap later, 2nd the inner loop finds the min value and updates the minIndex than in outer loop swap the value so left arr is sorted
         * */

        for(int i=0; i<arr.length-1; i++) {
            int minIndex = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
                if(minIndex != i) {
                    int temp = arr[minIndex];
                    arr[minIndex] = arr[i];
                    arr[i] = temp;
                }
            }
        }

    }
}
