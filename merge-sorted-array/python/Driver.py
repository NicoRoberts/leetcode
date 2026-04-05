from Solution import Solution

def main():
    nums1 = [1, 2, 3, 0, 0, 0]
    m = 3
    nums2 = [2, 5, 6]
    n = 3

    sol = Solution()
    sol.merge(nums1, m, nums2, n)

    print(nums1)

if __name__ == "__main__":
  main()