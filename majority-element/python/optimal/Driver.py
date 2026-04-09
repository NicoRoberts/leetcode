from Solution import Solution

def main():
  nums = [2,2,1,1,1,2,2]
  # Output: 2
  sol = Solution()
  result = sol.majorityElement(nums)
  print("The majority element is: ", result)


if __name__ == "__main__":
  main()