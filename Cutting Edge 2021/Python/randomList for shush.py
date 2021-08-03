import random

l = ['s', 'h']
x = int(input())
for c in range (x):
    let = ""
    for d in range(random.randint(10, 30)):
        let = let + random.choice(l)
    print(let) 
