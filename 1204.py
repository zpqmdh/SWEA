# [S/W 문제해결 기본] 1일차 - 최빈수 구하기
T = int(input())
for i in range(1, T+1):
    N = int(input())
    L = list(map(int, input().split()))
    D = {}
    max_number = -1
    max_number_list = []
    for i in L:
        if i not in D.keys():
            D[i] = 1
        else:
            D[i] += 1
    for k, v in D.items():
        if v > max_number:
            max_number = v
            max_number_list = [k]
        elif v == max_number:
            max_number_list.append(k)
    max_number_list.sort(reverse=True)
    print(f'#{N} {max_number_list[0]}')