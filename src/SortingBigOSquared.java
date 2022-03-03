public class SortingBigOSquared {

    public static void insertion(int[] arr) {
        // declare a variable to hold our sorted element
        int sortedPart = 0;
        // traverse the length of our array starting at index 1
        for (int i = 1; i < arr.length; i++) {
            // sortedPart variable is assigned with the element at arr[i]
            sortedPart = arr[i];
            // declare a second variable j assigned to the element left of i
            int j = i - 1;
            // while j is greater than or equal to 0 and element at arr[j] is greater than element assigned to sortedPart
            // enter our while loop
            while (j >= 0 && arr[j] > sortedPart) {
                // then the element at j + 1 gets assigned with the element at j
                arr[j + 1] = arr[j];
                // j gets decremented
                j--;
            }
            // the element at j + 1 gets assigned with the element assigned to sortedPart
            arr[j + 1] = sortedPart;
        }
    }

    public static void selection(int[] arr) {
        // declare variables
        int maxIdx = 0;
        int temp = 0;
        // traverse from the back of the array to the start
        for (int end = arr.length-1; end >= 0; end--) {
            // maxIdx gets assigned with the result of select method
            maxIdx = select(arr, end);
            // temp gets assigned with the element at maxIdx in our array
            temp = arr[maxIdx];
            // maxIdx position gets assigned with the element at end position
            arr[maxIdx] = arr[end];
            // the element at end position is now assigned the element stored in temp
            arr[end] = temp;
        }
    }

    /*
    *
    * Helper method for selection sort
    *
     */
    public static int select(int[] arr, int end) {
        // declare variable to hold our max index
        int maxIdx = 0;
        // traverse the for loop starting at index position 1
        for (int i = 1; i <= end; i++) {
            // essentially a max number algo
            if (arr[i] > arr[maxIdx]) {
                maxIdx = i;
            }
        }
        // return our max index
        return maxIdx;
    }

    public static void bubble(int[] A) {
        // declare variables
        // isSorted boolean is always true
        boolean isSorted = true;
        // obtain the length of our array
        int len = A.length;
        // maintain a counting variable
        int count = 0;
        // while isSorted is true and len >= 2
        // enter the while loop
        while (isSorted && len >= 2) {
            // count increases
            count++;
            // isSorted gets assigned a value of true or false based off bubbleHelper method
            isSorted = bubbleHelper(A, len);
            // decrement our length
            len--;
        }
    }

    public static boolean bubbleHelper(int[] A, int len) {
        // declare a variable to always be false
        boolean swapped = false;
        // traverse the length of len variable (length of the array)
        for (int i = 0; i < len - 1; i++) {
            // compare if element at i is greater than element at i + 1
            if (A[i] > A[i + 1]) {
                // if so, assign temp to be the element at i
                int temp = A[i];
                // the element at i is now assigned the element at i + 1
                A[i] = A[i + 1];
                // the element at i + 1 is now assigned the element at temp
                A[i + 1] = temp;
                // A swap has happened therefore swapped becomes true
                // the while loop will continue to execute till it is false
                swapped = true;
            }
        }
        // this should always return false therefore the array is sorted
        return swapped;
    }

}
