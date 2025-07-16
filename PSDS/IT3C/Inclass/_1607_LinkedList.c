#include <stdio.h>
#include <stdlib.h>

struct Node
{
  int data;
  struct Node *next;
};

void traverse(struct Node *current)
{
  while (current != NULL)
  {
    printf("%d -> ", current->data);
    current = current->next;
  }
  printf("NULL\n");
}

void reverseLinkedList(struct Node **head)
{
  struct Node *prev = NULL;
  struct Node *current = *head;
  struct Node *next = *head;

  while (next != NULL)
  {
    next = next->next;
    current->next = prev;
    prev = current;
    current = next;
  }
  *head = prev;
  traverse(prev);
}

int main()
{

  struct Node *head = malloc(sizeof(struct Node));
  head->data = 10;
  head->next = NULL;

  struct Node *second = malloc(sizeof(struct Node));
  second->data = 20;
  second->next = NULL;

  struct Node *third = malloc(sizeof(struct Node));
  third->data = 30;
  third->next = NULL;

  // linked them
  head->next = second;
  second->next = third;
  // 10 -> 20 -> 30 -> NULL
  // 30 -> 20 -> 10 -> NULL // after reversing the LL

  traverse(head);
  reverseLinkedList(&head);
  traverse(head);
}
