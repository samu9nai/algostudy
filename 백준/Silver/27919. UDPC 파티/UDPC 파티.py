str = input()
res = ""
uc = 0
dp = 0
for i in range(len(str)) :
    if str[i] == 'U' or str[i] == 'C' :
        uc += 1
    elif str[i] == 'D' or str[i] == 'P' :
        dp += 1
if uc > ((dp+1)/2) :
    res += "U"
if dp > 0 :
    res += "DP"
print(res)