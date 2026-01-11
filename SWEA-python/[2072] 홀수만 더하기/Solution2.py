T = int(input())

for i in range(1, T + 1):
    numbers = list(map(int, input().split()))
    result = sum(n for n in numbers if n % 2 != 0)
    
    print(f"#{i} {result}")