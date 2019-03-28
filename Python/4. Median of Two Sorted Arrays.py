class Solution:
    def findMedianSortedArrays(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        curr=[]
        i,j =0,0
        while nums1 and nums2:
            if nums1 <= nums2:
                curr.append(nums1[i])
                i+=1
            else:
                curr.append(nums2[j])
                j+=1
        
        while nums1:
            curr.append(nums1[i])
            i+=1
        while nums2:
            curr.append(nums2[j])
            j+=1
        # curr = nums1 + nums2 
        # curr.sort()
        
        lenCurr = len(curr)
        mid = lenCurr// 2
        if lenCurr % 2 != 0:
            return curr[mid]
        else:
            return (curr[mid-1] + curr[mid])/2