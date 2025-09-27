class Solution:
    def kBitFlips(self, arr, k):
        n = len(arr)
        flip = 0        # current flip parity (even=0, odd=1)
        ans = 0
        isFlipped = [0] * n  # marks where a flip started

        for i in range(n):
            # remove effect of flips that ended before index i
            if i >= k:
                flip ^= isFlipped[i - k]

            # if current bit after considering flips is 0 → must flip here
            if arr[i] ^ flip == 0:
                if i + k > n:  # can't flip beyond array
                    return -1
                ans += 1
                flip ^= 1
                isFlipped[i] = 1

        return ans
