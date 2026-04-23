n = int(input())
start = 0
end = 0
sum = 0
cnt = 0

while end <= n :
    if sum < n :
        end += 1
        sum += end
    elif sum > n :
        sum -= start
        start += 1
    else:
        cnt += 1
        end += 1
        sum += end
print(cnt)
