# 두 개의 숫자열
T = int(input())
for t in range(1, T+1):
    N, M = map(int, input().split())
    A = list(map(int, input().split()))
    B = list(map(int, input().split()))
    answer = 0
    if N > M:
        for start_idx in range(N-M+1):
            tmp = 0
            for i in range(M):
                tmp += A[start_idx+i] * B[i]
            if tmp > answer:
                answer = tmp
    else:
        for start_idx in range(M-N+1):
            tmp = 0
            for i in range(N):
                tmp += A[i] * B[start_idx+i]
            if tmp > answer:
                answer = tmp
    print(f'#{t} {answer}')

