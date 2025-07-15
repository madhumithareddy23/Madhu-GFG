#User function Template for python3
class Solution:
    def subarraySum(self, arr, target):
        # code here
        for i in range(len(arr)):
            first_num = 0
            for j in range(i,len(arr)):
                second_num = arr[j]
                first_num += second_num
                if first_num == target:
                    return [i+1,j+1]
                    break
                elif first_num > target:
                    break
        else:
            return [-1]