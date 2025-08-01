
#include <stdio.h>
#include <stdlib.h>

#define MAX 100

int queue[MAX];
int size;
int front;
int rear;

void createQueue(int userSize)
{
  size = userSize;
  front = -1;
  rear = -1;
}

void printQueue()
{
  if (front == -1 || front == rear)
  {
    printf("Queue is empty.\n");
    return;
  }
  printf("Queue elements: ");
  for (int i = front; i <= rear; i++)
  {
    printf("%d ", queue[i]);
  }
  printf("\n");
  return;
}

// 1. enqueue
void enqueue(int data)
{
  if (rear == size - 1)
  {
    printf("Queue is full.\n");
    return;
  }

  if (front == -1)
  {
    front = 0;
  }

  rear++;
  queue[rear] = data;
  return;
}

// 2. dequeue
void dequeue()
{
  if (front == -1 || front == rear)
  {
    printf("Queue is empty.\n");
    return;
  }

  int frontElement = queue[front];
  front++;
  printf("Front Elemenet in the queue is: %d\n", frontElement);
  return;
}

// 3. peek
void peek()
{
  if (front == -1 || front == rear)
  {
    printf("Queue is empty.\n");
    return;
  }

  int frontElement = queue[front];
  printf("Peek Elemenet in the queue is: %d\n", frontElement);
  return;
}

int main()
{
  createQueue(10);
  enqueue(3);
  enqueue(4);
  enqueue(5);
  printQueue();
  dequeue();
  printQueue();
  peek();
  printQueue();
}
