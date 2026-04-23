import sys
input = sys.stdin.readline

s, p = map(int, input().split())
string = input().rstrip()
a, c, g, t = map(int, input().split())

pwd = string[: p]

tmp = {"A":0, "C":0, "G":0, "T":0}
for i in pwd:
    tmp[i] += 1
    
cnt = 0
if tmp["A"] >= a and tmp["C"] >= c and tmp["G"] >= g and tmp["T"] >= t :
    cnt += 1

start = 0
end = start + p

for i in range (len(string) - p) :
    tmp[string[start + i]] -= 1
    tmp[string[end + i]] += 1
    if tmp["A"] >= a and tmp["C"] >= c and tmp["G"] >= g and tmp["T"] >= t :
        cnt += 1
print(cnt)