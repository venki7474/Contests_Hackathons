#include <stdio.h>
int main() {
	int t;
	scanf("%d",&t);
	while (t -- > 0) {
		int n;
		scanf("%d",&n);
		int arr[n],i = 0, sum = 0;
		int flag = 0, merit = 0;
		while (i < n){
			scanf("%d",&arr[i]);
			sum = sum+arr[i];
				if (arr[i] <= 2) {
					flag = 1;
				}
				if (arr[i] == 5){
					merit = 1;
				}
			i ++;
		}
		float avg = 0;
			avg = sum/n;
			// printf("%f",avg);
			if (flag == 0 && merit == 1 && avg >= 4.0) {
				printf("Yes");
			} else {
				printf("No");
			}

	}
}
