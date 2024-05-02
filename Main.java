import java.util.Random;
public class Main {

    public static void main(String[] args) {
        int[] N = { 1000,2000,4000,8000,16000 }; // Different sizes of arrays to test
        int[] K= {5, 4, 3, 2, 1, 0};
        for (int i = 0; i < N.length; i++) {
            int[] array = constructArray(N[i],K[i]); // Generate random array of given size
            Stopwatch stopwatch = new Stopwatch();
            InsertionSort.Sort(array);
            /*SelectionSort.Sort(array);
            ShellSort.Sort(array);
            MergeSort.Sort(array,0,array.length-1);
            BottomUpMergeSort.Sort(array);
            QuickSort.Sort(array,0,array.length-1);*/
            double time = stopwatch.elapsedTime();
            System.out.println("Array size: " + N[i] + ", Time taken: " + time + " seconds");
        }
    }

    // Generate a random integer array of given size
    public static int[] constructArray(int N, int K) {
        int[] array = new int[N];
        //need to handel K>n and k=n
        // Initialize variables
        int in = 0;
        int out = 0;

        Random random = new Random();

        // Fill the array with sorted elements
        for (int j = 0; j < N; j++) {
            double p = random.nextDouble();
            if (p * (N - j) < (K - out)) {
                array[N - 1 - out] = j + 1;
                out++;
            } else {
                array[in] = j + 1;
                in++;
            }
        }

        // Shuffle the last K elements
        for (int j = 0; j < K; j++) {
            int q = random.nextInt(K);
            int temp = array[N - K + j];
            array[N - K + j] = array[N - K + q];
            array[N - K + q] = temp;
        }

        return array;
    }
}
