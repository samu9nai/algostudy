import sys
input = sys.stdin.readline

n = int(input())
a = list(map(int, input().split()))
sum = sum(a)
res = 0
for i in a:
    sum -= i
    res = (res + i * sum) % 1000000007

print(res)