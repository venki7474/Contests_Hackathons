num = bin(int(input().strip()))[2:]
c = 0;prev = 0
for i in range(len(num)):
	if num[i] is '1':
		c+=1
		prev = c if c>= prev else prev
	elif num[i] is '0':
		c = 0
print(prev)