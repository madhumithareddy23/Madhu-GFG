class Solution:
    def generateBinary(self, n):
        # code here
        res = []
        for i in range(n):
            res.append(bin(i+1)[2:])
        return res
        