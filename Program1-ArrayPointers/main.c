#include <stdio.h>



void main(){

	printf("Question 1 :\n");
	//Question 1 : Make 1D array of size 100
	int array[100];

	//1A : Using pointer Load array from 0 to 99
	int* ptr = &array[0];
	int i;
	for(i = 0; i < 100; i++){
		*ptr = i;
		ptr++;
	}

	//1B : Ascending Order
	printf("Ascending Order:\n");
	ptr = &array[0];
	for(i = 0; i < 100; i++){
		printf("%d ", *ptr);
		ptr++;
	}

	//1C : Descending Order
	printf("\nDescending Order:\n");
	ptr = &array[99];
	for(i = 0; i < 100; i++){
		printf("%d ", *ptr);
		ptr--;
	}

	//Program 2
	second();

}
