#include <stdio.h>
#include <string.h>
#include <ctype.h>
#include <math.h>

#define MAX 100

char stack[MAX];
int top = -1;

void push(char c)
{
  stack[++top] = c;
}
char pop()
{
  return stack[top--];
}
char peek()
{
  return stack[top];
}
int isEmpty()
{
  return top == -1;
}

int precedence(char op)
{
  if (op == '^')
    return 3;
  if (op == '*' || op == '/')
    return 2;
  if (op == '+' || op == '-')
    return 1;
  return 0;
}

int isOperator(char ch)
{
  return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^';
}

void infixToPostfix(char *infix, char *postfix)
{
  int k = 0;
  for (int i = 0; infix[i]; i++)
  {
    char ch = infix[i];
    if (isalnum(ch))
    {
      postfix[k++] = ch;
    }
    else if (ch == '(')
    {
      push(ch);
    }
    else if (ch == ')')
    {
      while (!isEmpty() && peek() != '(')
      {
        postfix[k++] = pop();
      }
      if (!isEmpty())
        pop(); // remove '('
    }
    else if (isOperator(ch))
    {
      while (!isEmpty() && precedence(peek()) >= precedence(ch))
      {
        postfix[k++] = pop();
      }
      push(ch);
    }
  }

  while (!isEmpty())
  {
    postfix[k++] = pop();
  }

  postfix[k] = '\0';
}

int evaluatePostfix(char *postfix)
{
  int valStack[MAX];
  int topVal = -1;

  for (int i = 0; postfix[i]; i++)
  {
    char ch = postfix[i];
    if (isdigit(ch))
    {
      valStack[++topVal] = ch - '0';
    }
    else
    {
      int b = valStack[topVal--];
      int a = valStack[topVal--];
      switch (ch)
      {
      case '+':
        valStack[++topVal] = a + b;
        break;
      case '-':
        valStack[++topVal] = a - b;
        break;
      case '*':
        valStack[++topVal] = a * b;
        break;
      case '/':
        valStack[++topVal] = a / b;
        break;
      case '^':
        valStack[++topVal] = pow(a, b);
        break;
      }
    }
  }

  return valStack[topVal];
}

int main()
{
  char infix[MAX], postfix[MAX];
  scanf("%s", infix);

  infixToPostfix(infix, postfix);
  printf("Postfix Expression: %s\n", postfix);

  int allDigits = 1;
  for (int i = 0; postfix[i]; i++)
  {
    if (!isdigit(postfix[i]) && !isOperator(postfix[i]))
    {
      allDigits = 0;
      break;
    }
  }

  if (allDigits)
  {
    printf("Evaluated Result: %d\n", evaluatePostfix(postfix));
  }
  else
  {
    printf("Evaluation skipped: expression contains non-digit operands.\n");
  }

  return 0;
}
