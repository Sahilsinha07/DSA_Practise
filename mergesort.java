public class mergesort {

    private static void printArr(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String args[]) {
        int[] array = { 6, 5, 3, 8, 9 };

        System.out.println("Sorting using merge sort");
        mergeSort(array, 0, array.length - 1);
        printArr(array);
    }

    private static void mergeSort(int[] array, int si, int ei) {
        // Base case: If si is greater or equal to ei, return.
        if (si >= ei) {
            return;
        }

        // Find the middle index.
        int mid = si + (ei - si) / 2;

        // Recursively sort the left and right parts of the array.
        mergeSort(array, si, mid);
        mergeSort(array, mid + 1, ei);

        // Merge the sorted subarrays.
        merge(array, si, mid, ei);
    }

    private static void merge(int[] array, int si, int mid, int ei) {
        // Calculate the size of the temporary array.
        int[] temp = new int[ei - si + 1];
        int i = si; // Iterator for the left part.
        int j = mid + 1; // Iterator for the right part.
        int k = 0; // Iterator for the temp array.

        while (i <= mid && j <= ei) {
            if (array[i] <= array[j]) {
                temp[k] = array[i];
                i++;
            } else {
                temp[k] = array[j];
                j++;
            }
            k++;
        }

        // Copy any remaining elements from the left part.
        while (i <= mid) {
            temp[k++] = array[i++];
        }

        // Copy any remaining elements from the right part.
        while (j <= ei) {
            temp[k++] = array[j++];
        }

        // Copy the merged array back to the original array.
        for (k = 0, i = si; k < temp.length; k++, i++) {
            array[i] = temp[k];
        }
    }
}
