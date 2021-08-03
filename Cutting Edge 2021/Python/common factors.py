nums = input()
m = nums.split(" ")
m = list(map(int, m))

limit = 0

if m[0]<m[1]:
    limit = m[0] + 1
else:
    limit = m[1] + 1



count = 0

for x in range(1, limit):
    if (m[0]%x==0) and (m[1]%x==0):
        print(x)
        count+=1
print(count)
