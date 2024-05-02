public class QuickSort {
    public static void Sort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array
            int partitionIndex = partition(arr, low, high);

            // Recursively sort elements before and after the partition
            Sort(arr, low, partitionIndex - 1);
            Sort(arr, partitionIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choose the pivot element (could be any element)
        int i = low - 1; // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to the pivot
            if (arr[j] <= pivot) {
                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
