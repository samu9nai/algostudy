n = int(input())
arr1 = list(map(int, input().split()))
arr2 = list(map(int, input().split()))
arr1.sort()
sum = 0
sorted_arr2 = arr2
for i in range(n) :
    sum += (arr1[i] * sorted_arr2[sorted_arr2.index(max(sorted_arr2))])
    sorted_arr2.remove(max(sorted_arr2))
print(sum)