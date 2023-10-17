class QuickSort {
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String args[]) {
        int[] array = { 6, 3, 9, 8, 2, 5 };
        quickSort(array, 0, array.length - 1);
        System.out.println("Sorted array in ascending order:");
        printArray(array);
    }

    public static void quickSort(int[] array, int si, int ei) {
        // base condition
        if (si >= ei) {
            return;
        }

        // pivot point is the last element
        int pIdx = partition(array, si, ei);
        // this function will do the sorting around the pivot point and give us the
        // index of the pivot point after placing it in its right position
        quickSort(array, si, pIdx - 1); // pivot point is placed; now we have to solve the left part with the same
                                        // technique
        quickSort(array, pIdx + 1, ei); // this is for the right part
    }

    public static int partition(int[] array, int si, int ei) {
        int pivot = array[ei];
        int i = si - 1; // this will make the position for the elements smaller than the pivot.
        // now swapping of elements smaller than the pivot before it.
        for (int j = si; j < ei; j++) {// here we are running a loop before the pivot element index
            i++;
            // swapping of the smaller elements to the front place
            int temp = array[j];
            array[j] = array[i]; // here i is for the swapping index and j is the value on which the loop is
                                 // and element smaller than pivot
            array[i] = temp;
        }
        // now let's place the pivot in the right position.
        i++;
        int temp = pivot;
        array[ei] = array[i];
        array[i] = temp;
        return i; // because i is the index of the pivot.
    }
}
