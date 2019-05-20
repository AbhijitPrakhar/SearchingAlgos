public class BinarySearch {

    public boolean search(int[] arr, int x) {
        return binarySearch(arr, 0, arr.length-1, x);
    }

    private boolean binarySearch(int[] array, int start, int end, int x) {
        if(end >= start) {
            int mid = (start + end)/2;
            if(array[mid] == x) {
                return true;
            }
            if(array[mid] < x) {
                return binarySearch(array, mid+1, end, x);
            }
            return binarySearch(array, start, mid-1, x);
        }
        return false;
    }

}
