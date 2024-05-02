public class InsertionSort {

    public static void Sort(int[] arr) {
        /*
         *pseudocode
         * //consider the left side sorted
         * //find the right  position of arr[j]
         * for (i=1 to arr size)
         * int j=i
         * while((j>0) and (arr[j-1]> arr[j])){ // 2nd condition is for checking if the left element s larger than the current element(jth element)
         *    swap(arr[j],arr[j-1])
         *    j--; for going left side
         * }
         * */
        for(int i=1; i<arr.length; i++){
            int j = i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
}
