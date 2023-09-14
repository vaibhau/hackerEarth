'''
# Sample code to perform I/O:

name = input()                  # Reading input from STDIN
print('Hi, %s.' % name)         # Writing output to STDOUT

# Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
'''

# Write your code here
# ans = 

def is_divisible(l):
    for i in l:
        last_digit = i % 10
        if last_digit != 0:
            return "No"
        return "Yes"
n = int(input())
l = list(map(int, input().split()))
print(is_divisible(l))
# Read input N = int(input()) A = list(map(int, input().split())) # Check divisibility result = is_divisible(A) print(result)
