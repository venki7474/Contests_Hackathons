t = int(input().strip())
for a0 in range(t):
    n,k = input().strip().split(' ')
    n,k = [int(n),int(k)]
    res = 0
    for i in range(n):
    	for j in range(i+1,n+1):
    		l = i&j
    		if res < l and l < k:
    			res = l
    print(res)

