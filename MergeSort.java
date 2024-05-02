public class MergeSort {
    public static void Sort(int[] arr, int leftIndex, int rightIndex) {
        if (leftIndex < rightIndex) {
            int mid = (leftIndex + rightIndex) / 2;
            Sort(arr, leftIndex, mid);
            Sort(arr, mid + 1, rightIndex);
            merge(arr, leftIndex, mid, rightIndex);
        }
    }

    private static void merge(int[] arr, int leftIndex, int mid, int rightIndex) {
        int[] tempArray = new int[rightIndex - leftIndex + 1];
        int i = leftIndex; // Index for the left subarray
        int j = mid + 1; // Index for the right subarray
        int k = 0; // Index for the temporary array

        while (i <= mid && j <= rightIndex) {
            if (arr[i] <= arr[j]) {
                tempArray[k++] = arr[i++];
            } else {
                tempArray[k++] = arr[j++];
            }
        }

        // Copy remaining elements of left subarray
        while (i <= mid) {
            tempArray[k++] = arr[i++];
        }

        // Copy remaining elements of right subarray
        while (j <= rightIndex) {
            tempArray[k++] = arr[j++];
        }

        // Copy elements from tempArray back to arr
        for (i = 0; i < tempArray.length; i++) {
            arr[leftIndex + i] = tempArray[i];
        }
    }
}
