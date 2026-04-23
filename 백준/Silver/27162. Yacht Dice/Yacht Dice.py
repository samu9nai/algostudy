import sys

if __name__ == '__main__':
    zokbo = sys.stdin.readline().rstrip()
    d1, d2, d3 = map(int, sys.stdin.readline().rstrip().split())
    mydice = [d1, d2, d3]
    set_mydice = set(mydice)
    max_score = -1

    for i in range(12):
        if zokbo[i] == 'Y':
            # Ones
            if i == 0:
                now_score = mydice.count(1) + 2
                max_score = max(max_score, now_score)
            # Twos
            elif i == 1:
                now_score = mydice.count(2)*2 + 4
                max_score = max(max_score, now_score)
            # Threes
            elif i == 2:
                now_score = mydice.count(3)*3 + 6
                max_score = max(max_score, now_score)
            # Fours
            elif i == 3:
                now_score = mydice.count(4)*4 + 8
                max_score = max(max_score, now_score)
            # Fives
            elif i == 4:
                now_score = mydice.count(5)*5 + 10
                max_score = max(max_score, now_score)
            # Sixs
            elif i == 5:
                now_score = mydice.count(6)*6 + 12
                max_score = max(max_score, now_score)
            # Four of a Kind
            elif i == 6:
                now_score = 0
                if len(set_mydice) == 2:
                    for now_eye in list(set_mydice):
                        if mydice.count(now_eye) == 2:
                            now_score = now_eye*4
                elif len(set_mydice) == 1:
                    now_score = d1*4
                max_score = max(max_score, now_score)
            # Full House
            elif i == 7:
                now_score = 0
                if len(set_mydice) == 2:
                    now_score = max(set_mydice)*3 + min(set_mydice)*2
                elif len(set_mydice) == 1:
                    if d1 == 6:
                        now_score = 6*3 + 5*2
                    else:
                        now_score = d1*3 + 6*2
                max_score = max(max_score, now_score)
            # Little Straight
            elif i == 8:
                now_score = 0
                if len(set_mydice & {1, 2, 3, 4, 5}) == 3:
                    now_score = 30
                max_score = max(max_score, now_score)
            # Big Straight
            elif i == 9:
                now_score = 0
                if len(set_mydice & {2, 3, 4, 5, 6}) == 3:
                    now_score = 30
                max_score = max(max_score, now_score)
            # Yatch
            elif i == 10:
                now_score = 0
                if len(set_mydice) == 1:
                    now_score = 50
                max_score = max(max_score, now_score)
            # Choice
            else:
                now_score = sum(mydice) + 12
                max_score = max(max_score, now_score)

    print(max_score)
