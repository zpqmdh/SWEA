# [S/W 문제해결 응용] 4일차 - 보급로
from collections import deque
T = int(input())
for t in range(1, T+1):
    N = int(input())
    board = [list(map(int, input())) for _ in range(N)]
    visited = [[1e9 for _ in range(N)] for _ in range(N)]
    Q = deque()
    dy = [1, -1, 0, 0]
    dx = [0, 0, -1, 1]
    Q.append([0, 0])
    visited[0][0] = 0
    while Q:
        y, x = Q.popleft()
        for i in range(4):
            ny = y + dy[i]
            nx = x + dx[i]
            if 0<=ny<N and 0<=nx<N:
                if visited[ny][nx] > visited[y][x] + board[ny][nx]:
                    visited[ny][nx] = visited[y][x] + board[ny][nx]
                    Q.append([ny, nx])
    print(f'#{t} {visited[N-1][N-1]}')