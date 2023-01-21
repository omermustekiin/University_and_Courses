// Bubble sort in C

#include <stdio.h>

void bubbleSort(int array[], int size) {
   int step,i;
  // run loops two times: one for walking throught the array
  // and the other for comparison
  for(step=0;step<size-1;step++) {
    for(i=0;i<size-step-1;i++) {
      
      // To sort in descending order, change">" to "<".
      if (array[i] > array[i + 1]) {
        
        // swap if greater is at the rear position
        int temp = array[i];
        array[i] = array[i + 1];
        array[i + 1] = temp;
      }
    }
  }
}

// function to print the array
void printArray(int array[], int size) {
  int i;
  for(i=0;i<size;i++) {
    printf("%d  ", array[i]);
  }
  printf("\n");
}

// driver code
int main() {
  int data[] = {-2, 45, 0, 11, -9};
  int size = sizeof(data) / sizeof(data[0]);
  printf("size=%d\n",size);
  bubbleSort(data, size);
  printf("Sorted Array in Ascending Order:\n");
  printArray(data, size);
}

