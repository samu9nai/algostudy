import sys
input = sys.stdin.readline

n, m, x, k = map(int, input().split())
a = list(map(int, input().split()))
rating = [0] * (n + 1)

for i in range(n) :
    k += a[i]
    rating[i + 1] = rating[i] + (k < x)

for i in range(m) :
    start, end = map(int, input().split())
    print(rating[end - 1] - rating[start - 1])