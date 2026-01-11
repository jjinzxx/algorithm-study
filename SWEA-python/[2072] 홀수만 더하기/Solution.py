T = int(input())
result = []

for test_case in range(1, T+1):
    num = list(map(int, input().split()))
    sum = 0
    for j in range(len(num)):
        if num[j-1]%2==1:
            sum += num[j-1]
    result.append(sum)

for i in range(1, T+1):        
    print(f"#{i} {result[i-1]}")
