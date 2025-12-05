import sys

n = int(input())
arr = list(map(int, input().split()))
result = [-1] * n     # 일단 전부 -1로 초기화해 두고
stack = []            # 인덱스를 담는 스택

for i in range(n):
    # 현재 값이 스택 맨 위 인덱스의 값보다 크면,
    # 그 인덱스들의 오큰수는 모두 arr[i]
    while stack and arr[stack[-1]] < arr[i]:
        result[stack.pop()] = arr[i]
    # 현재 인덱스를 스택에 쌓음
    stack.append(i)

# 스택에 남은 인덱스들은 끝까지 가도 오큰수를 못 찾은 값들 → 이미 -1이므로 추가 처리 불필요

for i in range(n):
    sys.stdout.write(str(result[i]) + ' ')
