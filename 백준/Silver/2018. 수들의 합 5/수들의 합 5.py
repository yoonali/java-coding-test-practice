n = int(input())
count = total = start = end = 1

while end != n :
    if total == n:
        count += 1
        end += 1
        total += end
    elif total > n :
        total -= start
        start += 1
    else :
        end += 1
        total += end
 
print(count)