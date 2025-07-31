// implement stack with dynamic array

#include <stdio.h>
#include <stdlib.h>

int *stack;
int size;
int top;

void createStack(int userSize)
{
  stack = (int*) malloc(userSize * sizeof(int));
  size = userSize;
  top = -1;
}

// to print stack elements
void printStack()
{
  printf("Stack element from top: ");
  for (int i = top; i >= 0; i--)
  {
    printf("%d ", stack[i]);
  }
  printf("\n");
  return;
}

// 1. push
void push(int data)
{
  if (top == size - 1)
  {
    printf("Stack overflow: stack is already full.\n");
    return;
  }
  top++;
  stack[top] = data;
  return;
}

// 2. pop
void pop()
{
  if (top == -1)
  {
    printf("Stack underflow: stack is empty.\n");
    return;
  }
  int popedElement = stack[top];
  top--;
  printf("PopedElement: %d\n", popedElement);
  return;
}

// 3. peek
// write the peek operation
void peek()
{
  if (top == -1)
  {
    printf("Stack is empty.\n");
    return;
  }
  int peekElement = stack[top];
  printf("Peek element: %d\n", peekElement);
  return;
}

int main()
{
  createStack(2);
  pop(); // stack underflow
  peek(); // stack is empty
  printStack(); // []
  push(2);      // [2]
  push(3);      // [2,3]
  printStack(); // 3 2
  pop();        // output: 3 and your stack is [2]
  printStack(); // 2

  push(5);
  push(6);
  printStack();
  peek();
}
