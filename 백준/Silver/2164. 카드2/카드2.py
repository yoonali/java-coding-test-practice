from collections import deque

n = int(input())
arr = deque(range(1, n+1))

for i in range(n-1):
    arr.popleft()
    i = arr.popleft()
    arr.append(i)

print(arr[0])
