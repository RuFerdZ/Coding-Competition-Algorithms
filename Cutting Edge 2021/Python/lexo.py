def find(st):
    k=len(st)-2
    while not(k<0 or st[k]<st[k+1]):
        k-=1
    if k <0:
        return "no answer"
    st = list(st)
    j = len(st)-1
    while not(st[j]>st[k]):
        j-=1
    st[k],st[j]=st[j],st[k]
    st[k+1:]=st[k+1:][::-1]
    return(''.join(st))
 
for c in range(5):
    x = input()
    print(find(x))
