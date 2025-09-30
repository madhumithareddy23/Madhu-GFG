class Solution:
    def binstr(self, n):
        # code here
        li=[]
        for i in range(2**n):
            li.append(bin(i)[2:].zfill(n))
        return li
        