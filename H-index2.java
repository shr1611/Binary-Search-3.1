// TC: O(logn)
// SC: O(1)
class Solution {
    public int hIndex(int[] citations) {
      // max h index is when # of citations is >= arr[potentialH index]
      int n = citations.length;  
      int l = 0;
      int h = n-1;
      while(l <= h){
        int mid = l + (h-l)/2;
        int tempHind = n - mid; // h-index values are reverse to the actual indexes
        if(citations[mid] < tempHind){
          l = mid + 1;
        }else{
          h = mid - 1;
        }
      }
      return n - l; // get the h-index value from the index by doing n-index
    }
}
