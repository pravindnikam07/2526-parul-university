#include <stdio.h>
#include <string.h>
#include <stdlib.h>

#define MAX 100

int stack[MAX];
int top = -1;

// Push operation
void push(int value)
{
  if (top == MAX - 1)
  {
    printf("Stack Overflow\n");
    return;
  }
  stack[++top] = value;
  printf("%d pushed to stack\n", value);
}

// Pop operation
int pop()
{
  if (top == -1)
  {
    printf("Stack Underflow\n");
    return -1;
  }
  int val = stack[top--];
  printf("%d popped from stack\n", val);
  return val;
}

// Peek operation
void peek()
{
  if (top == -1)
  {
    printf("Stack is empty\n");
    return;
  }
  printf("Top element is %d\n", stack[top]);
}

// Traverse operation
void traverse()
{
  if (top == -1)
  {
    printf("Stack is empty\n");
    return;
  }
  printf("Stack elements:");
  for (int i = top; i >= 0; i--)
  {
    printf(" %d", stack[i]);
  }
  printf("\n");
}

// Search operation
void search(int key)
{
  if (top == -1)
  {
    printf("Stack is empty\n");
    return;
  }
  for (int i = top; i >= 0; i--)
  {
    if (stack[i] == key)
    {
      printf("Element %d found at position %d (from top)\n", key, top - i);
      return;
    }
  }
  printf("Element %d not found in stack\n", key);
}

// Helper to trim newline
void trimNewline(char *str)
{
  size_t len = strlen(str);
  if (len && str[len - 1] == '\n')
    str[len - 1] = '\0';
}

int main()
{
  int q;
  scanf("%d", &q);
  getchar(); // Consume newline left by scanf

  while (q--)
  {
    char input[100];
    fgets(input, sizeof(input), stdin);
    trimNewline(input);

    char command[20];
    int value;

    if (sscanf(input, "push %d", &value) == 1)
    {
      push(value);
    }
    else if (strcmp(input, "pop") == 0)
    {
      pop();
    }
    else if (strcmp(input, "peek") == 0)
    {
      peek();
    }
    else if (strcmp(input, "traverse") == 0)
    {
      traverse();
    }
    else if (sscanf(input, "search %d", &value) == 1)
    {
      search(value);
    }
    else
    {
      printf("Invalid command\n");
    }
  }

  return 0;
}
