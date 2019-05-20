public class JumpSearch {

    public boolean search(int[] arr, int x) {
        return jumpSearch(arr, x);
    }

    private boolean jumpSearch(int[] arr, int x) {
        int n =  arr.length;
        int step = (int) Math.floor(Math.sqrt(n));
        int prev = 0;

        while (arr[Math.min(step, n-1)] < x) {
            prev = step;
            step += step;
            // number is larger than the last number in an array
            if(prev >= n) {
                return false;
            }
        }

        while (arr[prev] < x) {
            prev++;
            if(prev == Math.min(step, n)) {
                return false;
            }
        }

        if(arr[prev] == x) {
            return true;
        }

        return false;
    }

}
