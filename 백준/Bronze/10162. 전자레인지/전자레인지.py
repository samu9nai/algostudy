timer = [300, 60, 10]
T = int(input())
res = [0, 0, 0]

if T % 10 != 0 :
    print(-1)
else:
    for i in range(3) :
        while T >= timer[i] :
            T -= timer[i]
            res[i] += 1
        if T == 0 :
            break
    print(*res)