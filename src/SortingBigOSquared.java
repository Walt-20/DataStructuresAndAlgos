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

    public static void selection(int[] arr) {
        int maxIdx = 0;
        int temp = 0;
        for (int end = arr.length-1; end >= 0; end--) {
            maxIdx = select(arr, end);
            temp = arr[maxIdx];
            arr[maxIdx] = arr[end];
            arr[end] = temp;
        }
    }

    public static int select(int[] arr, int end) {
        int maxIdx = 0;
        for (int i = 1; i <= end; i++) {
            if (arr[i] > arr[maxIdx]) {
                maxIdx = i;
            }
        }
        return maxIdx;
    }
}
