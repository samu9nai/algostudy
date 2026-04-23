n = int(input())
for i in range(n) :
    num = int(input())
    for i in range(2, num + 1) :
        cnt = 0
        if num % i == 0 :
            while num % i == 0 :
                num //= i
                cnt += 1
            print('%d %d' %(i, cnt))
        elif num == 1 :
            break