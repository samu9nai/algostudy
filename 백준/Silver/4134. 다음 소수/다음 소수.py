def isPrime(num) :
    if num == 0 or num == 1:
        return False
    for i in range (2, int(num**0.5)+1) :
        if num % i == 0 :
            return False
    return True

N = int(input())
prime = 0
for i in range(N) :
    num = int(input())
    while True:
        if isPrime(num) :
            print(num)
            break
        else :
            num += 1