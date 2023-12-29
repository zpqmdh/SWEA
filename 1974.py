T = int(input())
for t in range(1, T+1):
    flag = 1
    board = [list(map(int, input().split())) for _ in range(9)]
    for i in range(9):
        value = [0 for _ in range(10)]
        for j in range(9):
            value[board[i][j]] += 1
            value[board[j][i]] += 1
        if value.count(2) != 9:
            flag = 0
    for i in range(0, 9, 3):
        for j in range(0, 9, 3):
            value = [0 for _ in range(10)]
            for k in range(i, i+3):
                for l in range(j, j+3):
                    value[board[k][l]] += 1
            if value.count(1) != 9:
                flag = 0
    print(f'#{t} {flag}')
