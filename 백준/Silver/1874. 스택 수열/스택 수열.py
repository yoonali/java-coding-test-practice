n = int(input())
ex = [int(input()) for _ in range(n)]

stack = []
result = []
cur = 1
possible = True

for target in ex:
    
    while cur <= target:
        stack.append(cur)
        result.append("+")
        cur += 1

    if stack and stack[-1] == target:
        stack.pop()
        result.append("-")
    else:
        possible = False
        break

if possible:
    print("\n".join(result))
else:
    print("NO")