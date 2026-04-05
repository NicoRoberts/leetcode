from Solution import Solution

def main():
  nums = [0,1,2,2,3,0,4,2]
  val = 2
  sol = Solution()
  k = sol.removeElement(nums, val)
  print(nums)
  print(k)
  #Output: 5, nums = [0,1,4,0,3,_,_,_]


if __name__ == "__main__":
  main()