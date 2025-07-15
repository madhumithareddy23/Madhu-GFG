class Solution:
    def findDuplicates(self, arr):
        # code here
        seen=set()
        dup=set()
        for i in arr:
            if i in seen:
                dup.add(i)
            else:
                seen.add(i)
        return list(dup)