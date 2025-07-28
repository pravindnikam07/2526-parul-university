#include <stdio.h>
#include <stdlib.h>

struct Node
{
  int data;
  struct Node *next;
};

// traversing on the LinkedList
void traverse(struct Node *head_ref)
{
  struct Node *current = head_ref;

  while (current != NULL)
  {
    printf("%d -> ", current->data);
    current = current->next;
  }
  printf("NULL\n");
  return;
}

void insertAtEnd(struct Node *head_ref, int new_data)
{
  // create a new Node
  struct Node *new_node = (struct Node *)malloc(sizeof(struct Node));
  new_node->data = new_data;
  new_node->next = NULL;

  // traverse till last node
  struct Node *current = head_ref;
  while (current->next != NULL)
  {
    current = current->next;
  }

  // set the new node address in last node
  current->next = new_node;
  return;
}

// insert a node at the start of linkedlist
void insertAtBegining(struct Node **head, int new_data)
{
  // creating a new Node
  struct Node *new_node = (struct Node *)malloc(sizeof(struct Node));
  new_node->data = new_data;
  new_node->next = NULL;

  // set the address of head in next of new node
  new_node->next = *head;

  // reset the head at new_node
  *head = new_node;

  // or
  // struct Node *current = *head;
  // new_node->next = current;
  // current = new_node;
  // *head = current;

  return;
}

int main()
{
  printf("Start of the program...\n");
  struct Node *head = (struct Node *)malloc(sizeof(struct Node));
  head->data = 1;
  head->next = NULL;

  traverse(head); // 1 -> NULL

  insertAtEnd(head, 2);

  traverse(head); // 1 -> 2 -> NULL
  insertAtEnd(head, 3);
  insertAtEnd(head, 4);
  insertAtEnd(head, 5);
  traverse(head); // 1 -> 2 -> 3 -> 4 -> 5 -> NULL

  insertAtBegining(&head, 0);
  insertAtBegining(&head, -1);
  traverse(head);

  printf("End of the program...");
}
