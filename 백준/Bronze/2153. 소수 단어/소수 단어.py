def isPrime(num) :
    for i in range (2, int(num**0.5)+1) :
        if num % i == 0 :
            return False
    return True

str = input()
sum = 0
for s in str :
    if s.islower() :
        sum += ord(s) - 96
    else :
        sum += ord(s) - 38

if isPrime(sum) :
    print("It is a prime word.")
else :
    print("It is not a prime word.")