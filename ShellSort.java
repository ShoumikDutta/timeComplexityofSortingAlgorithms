public class ShellSort {
    public static void Sort(int[] arr) {
        /*
         * optimized version of insertion sort
         * insertion sort swaps adjacent elements while shellSort swaps elements in a gap
         * gap= arr.size/2N
         * when gap reaches 1, 2 elements will be out of order. need swap them onnce to sort the whole array( last iterationis insertionsort)
         * 3 nested loop: 1st one controls the gap,2nd one control the the minIndex 3rd loop goes through the arry to find the min value and update the min index
         * */
        for (int gap = arr.length/2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                int j = i;
                while(j>=gap && arr[j]<arr[j-gap]){
                    // this loop is same as insertion sort just replace 1 with gap to compare values within defined gap instead of adjacent values
                    int temp = arr[j];
                    arr[j] = arr[j-gap];
                    arr[j-gap] = temp;
                    j-=gap;
                }
            }
        }
    }
}
