package HW.HW2;
/* Supposing the isBadVersion API is defined in the parent class VersionControl:
      boolean isBadVersion(int version); */
      public class Solution extends VersionControl {
        public int firstBadVersion(int n) {
            int start = 1, end = n;
            while (start < end) {
                int mid = start + (end - start) / 2;
                if (isBadVersion(mid)) {
                    end = mid; // look on left side of mid
                } else {
                    start = mid + 1; // look on the right side of mid
                }
            }
            return start; // this point would be the first bad version
        }
    }
