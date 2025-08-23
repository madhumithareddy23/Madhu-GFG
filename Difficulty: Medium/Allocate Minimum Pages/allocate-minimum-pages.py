class Solution:
    def isPossible(self, arr, k, mid):
        students = 1
        current_sum = 0
        
        for pages in arr:
            if pages > mid:  # single book larger than mid → not possible
                return False
            
            if current_sum + pages > mid:
                students += 1
                current_sum = pages
                if students > k:
                    return False
            else:
                current_sum += pages
                
        return True

    def findPages(self, arr, k):
        n = len(arr)
        if k > n:  # not enough books
            return -1
        
        low, high = max(arr), sum(arr)
        result = -1
        
        while low <= high:
            mid = (low + high) // 2
            if self.isPossible(arr, k, mid):
                result = mid
                high = mid - 1  # try smaller maximum
            else:
                low = mid + 1  # increase limit
        
        return result
