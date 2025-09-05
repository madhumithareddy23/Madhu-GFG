class Solution:
    def leaders(self, arr):
        # code here
        rev = arr[::-1]
        output = []
        output.append(rev[0])
        for i in range(len(output)):
            for j in range(1,len(rev)):
                if rev[j] >= output[i]:
                    output.append(rev[j])
                    i += 1
                else:
                    continue
        return output[::-1]