N = int(input())
scores = list(map(int, input().split()))

max_score = max(scores)
total = 0.0

for s in scores:
    total += (s / max_score) * 100

print(total / N)
