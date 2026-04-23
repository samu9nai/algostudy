import sys
input = sys.stdin.readline

n, l = map(int, input().split())
a = [0] + list(map(int, input().split()))
s, cnt = 0, 0

for i in range (0, l) :
    s += a[i]
    if 129 <= s <= 138 :
        cnt += 1

win = sum(a[1 : l + 1])

if 129 <= win <= 138 :
        cnt += 1
        
for i in range(1, n - l + 1) :
    win -= a[i]
    win += a[l + i]
    if 129 <= win <= 138 :
        cnt += 1
        
print(cnt)