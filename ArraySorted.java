class Solution {
    boolean arraySortedOrNot(int[] arr, int n) {
      
      for(int i=1 ; i < n-1; i++) {
        if( arr[i] < arr[i-1]){
            return false;
        }
        return true;
      }
      return true;
    }
}
