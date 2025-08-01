#include <stdio.h>
#include <stdlib.h>

// create a struct node
struct Node
{
  int data;
  struct Node *next;
};

// to store the top element reference
struct Node *top;

// to crete the stack
void createStack()
{
  top = NULL;
}

// print stack
void printStack()
{
  printf("Stack elements: ");
  if (top == NULL)
  {
    printf("Stack is empty.\n");
    return;
  }

  struct Node *current = top;
  while (current != NULL)
  {
    printf("%d ", current->data);
    current = current->next;
  }
  printf("\n");
  return;
}

// 1. push operation
void push(int data)
{
  struct Node *new_node = (struct Node *)malloc(sizeof(struct Node));
  new_node->data = data;
  new_node->next = top;

  top = new_node;
  return;
}

// 2. pop operation
void pop()
{
  if (top == NULL)
  {
    printf("Stack is empty.\n");
    return;
  }
  int topElement = top->data;
  printf("Top element: %d\n", topElement);
  top = top->next;
  return;
}

// 3. peek operation
void peek()
{
  if (top == NULL)
  {
    printf("Stack is empty.\n");
    return;
  }
  int topElement = top->data;
  printf("Peek element: %d\n", topElement);
  return;
}

int main()
{
  createStack();
  peek();
  printStack();
  push(4);
  push(3);
  peek();
  printStack();
  push(2);
  push(1);
  push(0);
  printStack();
  pop();
  printStack();
  pop();
  printStack();
  peek();

}
