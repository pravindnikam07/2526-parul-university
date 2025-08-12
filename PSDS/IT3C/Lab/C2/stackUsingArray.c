#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

#define SIZE 100
// static way
int stack[SIZE];
// dynamic way
// int* stack = (int*)malloc(SIZE * sizeof(int));
int top;
int size;

void createStack(int userSize)
{
  top = -1;
  size = userSize;
}

// printing stack
void printStack()
{
  if (top == -1)
  {
    printf("Stack is empty\n");
    return;
  }

  printf("Stack elements: ");

  for (int i = top; i >= 0; i--)
  {
    printf("%d ", stack[i]);
  }
  printf("\n");
}

// 1. push
void push(int value)
{
  if (top == size - 1)
  {
    printf("Stack Overflow\n");
    return;
  }

  top++;
  stack[top] = value;
}

// 2. pop
int pop()
{
  if (top == -1)
  {
    printf("Stack Underflow\n");
    return -1;
  }

  int poppedElement = stack[top];
  top--;
  return poppedElement;
}

// 3. peek
int peek()
{
  if (top == -1)
  {
    printf("Stack is empty\n");
    return -1;
  }
  return stack[top];
}

// 4. isEmpty
bool isEmpty()
{
  return top == -1;
  // if (top == -1)
  // {
  //   return true;
  // }
  // return false;
}

int main()
{

  createStack(10);

  push(10);
  push(15);
  push(20);

  printStack();
  int poppedElement = pop();
  printf("Popped element: %d\n", poppedElement);
  printStack();

  int topElement = peek();
  printf("Top element: %d\n", topElement);
  printStack();
}
