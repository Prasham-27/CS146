# The isBadVersion API is already defined.
# @param version, an integer
# @return a bool
# def isBadVersion(version):

class Solution(object):
    def firstBadVersion(self, n):
        """
        :type n: int
        :rtype: int
        """
        start, end = 1, n
        while start < end:
            mid = start + (end - start) // 2
            if isBadVersion(mid):
                end = mid  # look on left side of mid
            else:
                start = mid + 1  # look on the right side of mid
        return start  # this point would be the first bad version