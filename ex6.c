/* developr: tom
   reviewer: dudi
   status: s
*/

# include <stdio.h>
int swap(int *num1, int *num2);
int main ()
{
	int num1, num2;
	printf ("input num1:");
	scanf ("%d", &num1);
	printf ("input num2:");
	scanf ("%d", &num2);
	Swap(&num1, &num2);
	return 0;
}
int Swap(int *num1, int *num2)
{
	int temp = *num1;
	*num1 = *num2;
	*num2 = temp;
	return (*num1, *num2);
}
