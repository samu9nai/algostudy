n = int(input())
km = list(map(int, input().split()))
price = list(map(int, input().split()))
sum = 0
min_price = price[0]
for i in range(n-1) :
    if price[i] < min_price :
        min_price = price[i]
    sum += min_price * km[i]
print(sum)