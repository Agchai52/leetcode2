/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if (n == 1) return 1;
        int l = 0;
        int r = n;
        while (l < r) {
            int m = l + (r - l) / 2;
            boolean flag = isBadVersion(m);
            if (!flag) l = m + 1;
            else r = m;
        }
        return l;
    }
}
