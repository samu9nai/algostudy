import sys
from collections import deque
input = sys.stdin.readline

m, n = map(int, input().rstrip().split())
graph = [list(map(int, input().rstrip())) for _ in range(m)]
dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

def bfs(x, y):
    q = deque()
    q.append((x, y))
    graph[x][y] = 2

    while q:
        a, b = q.popleft()

        for i in range(4):
            nx = dx[i] + a
            ny = dy[i] + b
            
            if 0<= nx < m and 0 <= ny < n:
                if graph[nx][ny] == 0:
                    graph[nx][ny] = 2
                    q.append((nx, ny))

for i in range(len(graph[0])):
    bfs(0, i)

if graph[m - 1].count(2):
    print("YES")
else:
    print("NO")