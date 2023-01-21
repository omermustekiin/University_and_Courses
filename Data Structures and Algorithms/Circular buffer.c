#include <stdio.h>
#define SIZE 5

int items[SIZE];
int front = -1, rear = -1;

int isFull() {
  if ((front == rear + 1) || (front == 0 && rear == SIZE - 1)) return 1;
  return 0;
}

int isEmpty() {
  if (front == -1) return 1;
  return 0;
}

void enQueue(int element) {
  if (isFull())
    printf("\n Kuyruk Dolu!! (Queue is full!!) \n");
  else {
    if (front == -1) front = 0;
    rear = (rear + 1) % SIZE;
    items[rear] = element;
    printf("\n Eklenen -> %d", element);
  }
}

// Removing an element
int deQueue() {
  int element;
  if (isEmpty()) {
    printf("\n Kuyruk Bos!! (Queue is empty !!) \n");
    return (-1);
  } else {
    element = items[front];
    if (front == rear) { // Tek eleman var ise,Kuruk resetlenir.
      front = -1;
      rear = -1;
    } 
    else {
      front = (front + 1) % SIZE;
    }
    printf("\n Kuyruktan Cekilen Eleman -> %d \n", element);
    return (element);
  }
}

void display() {
  int i;
  if (isEmpty())
    printf(" \n Kuyruk Bos!! (Queue is empty !!)\n");
  else {
    printf("\n Front -> %d ", front);
    printf("\n Elemanlar -> ");
    for (i = front; i != rear; i = (i + 1) % SIZE) {
      printf("%d ", items[i]);
    }
    printf("%d ", items[i]);
    printf("\n Rear -> %d \n", rear);
  }
}

int main() {
  deQueue();

  enQueue(1);
  enQueue(2);
  enQueue(3);
  enQueue(4);
  enQueue(5);

  enQueue(6);   // front == 0 && rear == SIZE - 1

  display();
  deQueue();

  display();

  enQueue(7);
  display();

  enQueue(8); //  front == rear + 1
  deQueue();

  enQueue(9);
  display();
  enQueue(10);
  deQueue();
  enQueue(10);
  return 0;
}
