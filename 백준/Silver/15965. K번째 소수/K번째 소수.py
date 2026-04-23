n = 10**7
isPrime = [True for x in range(n+1)]
isPrime[0], isPrime[1] = False, False

for i in range(2, int(n**0.5) + 1) :
    if isPrime[i] :
        for j in range(i * 2, n + 1, i) :
            isPrime[j] = False

k = int(input())
cnt = 0
for i in range(n) :
    if isPrime[i] :
        cnt += 1
    if cnt == k :
        print(i)
        break