#User function Template for python3
class Solution:

	def count(self,arr, n, x):
		# code here
    
        count = 0
        for i in range(0, n):
            a = arr[i]
            if a < x : 
                continue
            if a == x :
                count += 1
            if a > x :
                break
        
        return count

#{ 
 # Driver Code Starts
#Initial Template for Python 3




if __name__ == '__main__':
    tc = int(input())
    while tc > 0:
        n, x = list(map(int, input().strip().split()))
        arr = list(map(int, input().strip().split()))
        ob = Solution()
        ans = ob.count(arr, n, x)
        print(ans)
        tc -= 1

# } Driver Code Ends