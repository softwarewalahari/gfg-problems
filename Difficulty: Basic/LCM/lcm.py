#User function Template for python3
a = int(input())
b = int(input())
lcm=1
lcm_val=max(a,b)
for x in range(lcm_val,(a*b)+1):
     if x % a == 0 and x % b == 0:
        lcm = x
        break
print(lcm)    
    

# Your code here
