from collections import deque

def bfs(n):
    queue = deque([(n, 0)])  

    while queue:
        num, count = queue.popleft()

        if num == 1:
            return count  

        if num % 3 == 0:
            queue.append((num // 3, count + 1))
        if num % 2 == 0:
            queue.append((num // 2, count + 1))
        queue.append((num - 1, count + 1))

n = int(input())
print(bfs(n))