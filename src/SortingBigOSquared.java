public class SortingBigOSquared {

    public static void insertion(int[] arr) {
        int sortedPart = 0;
        for (int i = 1; i < arr.length; i++) {
            sortedPart = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > sortedPart) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = sortedPart;
        }
    }
}
