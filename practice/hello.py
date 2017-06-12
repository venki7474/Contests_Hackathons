s=raw_input()
res=""
for i in range(0,len(s)):
    if(i==0):
        res+=s[i].upper()
    elif(s[i-1]==" "):
        res += s[i].upper()
        # continue
    else:
        res+=s[i]

print (res)