t = int(raw_input());
while(t > 0):
	n =int(raw_input());
	r =int(raw_input());
	x = n-1
	num = 1
	y = 0
	if((r-1)>(n-r)):
		y = r-1
	else:
		y = n-1
	indx = 0
	# i = x
	# while(i > y):
	for i in xrange(x,0,y):
		pass
		indx = indx + 1
		num = num*i
		num = num / indx
		# i += -1
	print(num)
	t += -1
