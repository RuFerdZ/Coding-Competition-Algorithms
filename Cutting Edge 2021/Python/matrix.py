import random
x = int(input())
for y in range(x):
    for z in range(x):
        print(random.randint(0, 9), end = " ")
    print()
