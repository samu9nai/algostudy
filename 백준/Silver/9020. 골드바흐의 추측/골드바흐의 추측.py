def isPrime(num) :
    if num == 1 :
        return False
    for i in range(2, int(num**0.5) + 1) :
        if num % i == 0 :
            return False
    return True

n = int(input())

for i in range(n) :
    num = int(input())
    p1 = num // 2
    p2 = p1
    for j in range(p1) :
        if isPrime(p1) and isPrime(p2) :
            print('%d %d' %(p2, p1))
            break
        p1 += 1
        p2 -= 1