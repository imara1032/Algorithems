#include <iostream>

using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */



int main(int argc, char** argv) {
	int arr[] ={5,2,4,6,1,3};
	int j=0;
	int arr_size=sizeof(arr)/sizeof(*arr);
	
	for(int i=1;i<arr_size;i++ ){
		int key=arr[i-1];
		int j=i;
		while(key>arr[j] && j>0){
			arr[j-1]=arr[j];
			arr[j]=key;
			j--;
			key=arr[j-1];
		}
		array(arr);
		
	}
	return 0;
}
