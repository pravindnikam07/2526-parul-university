#include <stdio.h>
#include <stdlib.h>

struct Node
{
  int data;
  struct Node *next;
};

// Traversing the LinkedList
void traverse(struct Node *current)
{
  while (current != NULL)
  {
    printf("%d -> ", current->data);
    current = current->next;
  }
  printf("NULL\n");
  return;
}

// Inserting a new node at the end of the LinkedList
void insertAtEnd(struct Node *current, int new_data)
{
  struct Node *new_node = (struct Node *)malloc(sizeof(struct Node));
  new_node->data = new_data; // 70
  new_node->next = NULL;

  if (current == NULL)
  {
    current = new_node;
    return;
  }

  // 10 -> 30 -> 50 -> 70 -> NULL
  while (current->next != NULL)
  {
    current = current->next;
  }

  // current will pointing to the last node
  current->next = new_node;
  return;
}

int main()
{
  struct Node *head = (struct Node *)malloc(sizeof(struct Node));
  head->data = 10;
  head->next = NULL;
  // 10

  struct Node *second = (struct Node *)malloc(sizeof(struct Node));
  second->data = 30;
  second->next = NULL;

  head->next = second;
  // 10 -> 30

  struct Node *third = (struct Node *)malloc(sizeof(struct Node));
  third->data = 50;
  third->next = NULL;

  second->next = third;
  // 10 -> 30 -> 50

  // Traverse on a LinkedList
  printf("Linked List before insertion:\n");
  traverse(head);

  // insert a new node at the end with 70;
  insertAtEnd(head, 70);
  insertAtEnd(head, 100);

  printf("Linked List after insertion:\n");
  traverse(head);
}
