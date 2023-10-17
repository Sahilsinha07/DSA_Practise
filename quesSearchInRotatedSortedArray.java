public class quesSearchInRotatedSortedArray {

    public static void main(String agrs[]) {
        int[] array = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0; // output --> index 4
        int tarIndex = search(array, target, 0, array.length - 1);
        System.out.println(tarIndex);
    }

    public static int search(int[] array, int target, int si, int ei) {
        // int return type because this fxn will return index of target
        // kaam
        // mid
        int mid = si + (ei - si) / 2;
        // found on mid
        if (target == array[mid]) {
            return mid;
        }
        // mid on L1
        if (array[si] <= array[mid]) {
            // case a : left side->
            if (array[si] <= target && target <= array[mid]) {
                return search(array, target, si, mid - 1);
            } else { // case b : right side ->
                return search(array, target, mid + 1, ei);

            }
        }
        // mid on l2
        else {
            // case c: right side
            if (array[mid] <= target && target <= array[ei]) {
                return search(array, target, mid + 1, ei);
            } else {
                // case d : left side
                return search(array, target, si, mid - 1);
            }
        }
    }
}
