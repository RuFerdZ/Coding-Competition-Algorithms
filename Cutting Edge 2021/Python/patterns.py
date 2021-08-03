x = int(input("enter value: "))



for c in range (x):
    print((x-c) * "* ", end = '')
    print( (c * 2) * "  ", end = '')
    print((x-c) * " *")
    
x=x+1

for c in range (x):
    print(c * "* ", end='')
    print(((x-c-1)*2) * "  ", end = '')
    print(c * " *")

    
    
