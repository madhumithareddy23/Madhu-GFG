class Solution:
    def searchMatrix(self, mat, x):
        # code here
        n, m = len(mat), len(mat[0])
        left, right = 0, n * m - 1

        while left <= right:
            mid = (left + right) // 2
            mid_val = mat[mid // m][mid % m]

            if mid_val == x:
                return True

            left_val = mat[left // m][left % m]
            right_val = mat[right // m][right % m]

            # Left half is sorted
            if left_val <= mid_val:
                if left_val <= x < mid_val:
                    right = mid - 1
                else:
                    left = mid + 1
            # Right half is sorted
            else:
                if mid_val < x <= right_val:
                    left = mid + 1
                else:
                    right = mid - 1

        return False