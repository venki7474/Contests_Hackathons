# n,k = input().strip().split(' ')
# n,k = [int(n),int(k)]
# inp_arr = [int(a_temp) for a_temp in input().strip().split(' ')]
n, k= input().split( );
inp_arr = input().split( );
count = 0
for i in range(0, int(n)-1):
	for j in range(i+1, int(n)):
		num = int(inp_arr[i])+int(inp_arr[j])
		if  num % int(k) == 0:
			count+=1
print(count)