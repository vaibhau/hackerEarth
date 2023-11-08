# Solution 1

import math
n = int(input())
print(math.factorial(n))

# Solution 2

n = int(input())
fact = 1
if (n>=1) and (n<=10):
    for i in range(1,n+1):
        fact = fact * i

print(fact)
