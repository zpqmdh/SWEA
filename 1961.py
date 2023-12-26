# 숫자 배열 회전
T = int(input())

def rotate_L():
    new_L = []
    for i in range(N):
        tmp = []
        for j in range(N-1, -1, -1):
            tmp.append(L[j][i])
        new_L.append(tmp)
    return new_L
    
for t in range(1, T+1):
    N = int(input())
    L = [list(map(int, input().split())) for _ in range(N)]
    answer = []
    for i in range(3):
        L = rotate_L()
        answer.append(L)
    print(f'#{t}')
    for i in range(N):
        for k in range(3):
            for j in range(N):
                print(answer[k][i][j], end='')
            print(' ', end='')
        print()