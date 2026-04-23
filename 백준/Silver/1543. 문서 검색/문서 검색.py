string = input()
pattern = input()
S = len(string)
P = len(pattern)
cnt = 0
repeat = 0
while repeat <= S-P:
        if string[repeat:repeat+P] == pattern:
            cnt += 1
            repeat += P
        else:
            repeat += 1
print(cnt)
