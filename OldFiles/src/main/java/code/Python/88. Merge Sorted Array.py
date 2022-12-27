class Solution:
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: void Do not return anything, modify nums1 in-place instead.
        """
        # i for nums1 array and j for nums2 array
        i = m-1
        j = n-1
        k = m+n-1

        while i >-1 and j > -1:
            if nums1[i] < nums2[j]:
                nums1[k] = nums2[j]
                j-=1
            else :
                nums1[k] = nums1[i]
                i-=1
            k-=1
        while j>-1:
            nums1[k] = nums2[j]
            k-=1
            j-=1