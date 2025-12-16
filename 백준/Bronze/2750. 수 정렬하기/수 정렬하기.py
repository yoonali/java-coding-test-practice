n = int(input())
arr = []

for _ in range(n):
    a = int(input())
    arr.append(a)

# for i in range(n):
#     for :
#         if arr[i] > arr[i+1]:
#             temp = arr[i]
#             arr[i] = arr[i+1]
#             arr[i+1] = temp
#             print(i, arr)

n_arr = sorted(arr)

for result in n_arr:
    print(result)