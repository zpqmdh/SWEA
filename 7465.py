# 창용 마을 무리의 개수
from collections import deque
T = int(input())
for t in range(1, T+1):
    N, M = map(int, input().split())
    D = {}
    answer = 0
    for i in range(1, N+1):
        D[i] = []
    for i in range(M):
        a, b = map(int, input().split())
        D[a].append(b)
        D[b].append(a)
    visited = [False for _ in range(N+1)]
    def bfs(node):
        Q = deque()
        Q.append(node)
        while Q:
            cur = Q.popleft()
            visited[cur] = True
            for i in D[cur]:
                if not visited[i]:
                    Q.append(i)
        return 1
    for i in range(1, N+1):
        if not visited[i]:
            answer += bfs(i)
    print(f'#{t} {answer}')

