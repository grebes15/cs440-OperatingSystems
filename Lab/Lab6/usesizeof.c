#include <stdio.h>

int main(){


	short s;
	int i;
	long l;
	long long ll;
	long double ld;
	float f;
	double d;
	char c;
	char* c1;
	_Bool b;

	//this is all of the data types being used for this laboratory assignment


	printf("This is all in bytes \n");
	//this is all of the data types being represented in bytes by using the sizeof method which is avaialbe in the C programming language
	printf("Short: %d\n", sizeof(s));
	printf("Int: %d\n", sizeof(i));
	printf("Long: %d\n", sizeof(l));
	printf("Long Long: %d\n", sizeof(ll));
	printf("Long Double: %d\n", sizeof(ld));
	printf("Float: %d\n", sizeof(f));
	printf("Double: %d\n", sizeof(d));
	printf("Char %d\n", sizeof(c));
	printf("Char pointer: %d\n", sizeof(c1));
	printf("Boolean: %d\n", sizeof(b));

	printf("\n");

	printf("This is all in bits \n");
	//this is all of the data types being represented in bits
	printf("\n");


	/*
	in order the get the size of this variables in bits, I multiuple the sizeof method by 8 since the sizeof method computes
	the bytes and there are 8 bits in one byte. 
	*/
	printf("Short: %d\n", sizeof(s) * 8);
	printf("Int: %d\n", sizeof(i) * 8);
	printf("Long: %d\n", sizeof(l) * 8);
	printf("Long Long: %d\n", sizeof(ll) * 8);
	printf("Long Double: %d\n", sizeof(ld) * 8);
	printf("Float: %d\n", sizeof(f) * 8);
	printf("Double: %d\n", sizeof(d) * 8);
	printf("Char %d\n", sizeof(c) * 8);
	printf("Char pointer: %d\n", sizeof(c1) * 8);
	printf("Boolean: %d\n", sizeof(b) * 8);

	printf("\n");
/*
	this is the advanced features that I have implmented, I decided to implement an Array with 0 indexes, 1 index, and 5 indexes,
	and character of array with one element inside this array. 
	*/
	int iArray[0];

	int jArray[1];

	int xArray[5];

	char sArray = {"ArrayofCharacters"};

	//This printf statement will print out all of the data type size I have implemented in bytes and bits
	printf("Integer Array: %d bytes and %d bits \n", sizeof(iArray), sizeof(iArray) * 8);

	printf("Inter Array with 1 Array: %d bytes and %d bits \n", sizeof(jArray), sizeof(jArray) * 8);

	printf("Integer Array with 5 indexes: %d bytes and %d bits \n", sizeof(xArray), sizeof(xArray) * 8);

	printf("Character Array with one element: %d bytes and %d bits \n", sizeof(sArray), sizeof(sArray) * 8);





}

















