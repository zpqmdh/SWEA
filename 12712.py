# 파리퇴치3
T = int(input())
for t in range(1, T+1):
    N, M = map(int, input().split())
    board = [list(map(int, input().split())) for _ in range(N)]
    answer = 0
    for i in range(N):
        for j in range(N):
            # +
            result1 = board[i][j]
            for k in range(1, M):
                if 0<=i-k<N: # 상
                    result1 += board[i-k][j]
                if 0<=j-k<N: # 좌
                    result1 += board[i][j-k]
                if 0<=i+k<N: # 하
                    result1 += board[i+k][j]
                if 0<=j+k<N: # 우
                    result1 += board[i][j+k]
            # x
            result2 = board[i][j]
            for k in range(1, M):
                if 0<=i-k<N and 0<=j-k<N:
                    result2 += board[i-k][j-k]
                if 0<=i+k<N and 0<=j-k<N:
                    result2 += board[i+k][j-k]
                if 0<=i+k<N and 0<=j+k<N:
                    result2 += board[i+k][j+k]
                if 0<=i-k<N and 0<=j+k<N:
                    result2 += board[i-k][j+k]
            answer = max(answer, result1, result2)
    print(f'#{t} {answer}')


