for c in range(int(input())):
    S = input()
    scount=0
    hcount=0
    while(True):
        if (("ss" in S) or ("hh" in S)):
            S = S.replace("ss", "h")
            S = S.replace("hh", "s")
        else:
            break
    for x in S:
        if x=="s":
            scount+=1
        else:
            hcount+=1
    print(str(hcount) + " " + str(scount))
            
