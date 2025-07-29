// DLL

#include <stdio.h>
#include <stdlib.h>

// create a DLL node structure
struct Node
{
  int data;          // to store the data of current node
  struct Node *prev; // to store the address of previous node
  struct Node *next; // to store the address of next node
};

// print the LL using traversal
void traverse(struct Node *head_ref)
{
  struct Node *current = head_ref;

  while (current != NULL)
  {
    printf("%d -> ", current->data);
    current = current->next; // this is for moving your current pointer
  }
  printf("NULL\n");
  return;
}

// inserting the node at the end
void insertAtEnd(struct Node *head_ref, int new_data)
{
  // step 1: creating a new Node with new_data
  struct Node *new_node = (struct Node *)malloc(sizeof(struct Node));
  new_node->data = new_data;
  new_node->prev = NULL;
  new_node->next = NULL;

  // step 2: reach to the last node
  struct Node *current = head_ref;
  while (current->next != NULL)
  {
    current = current->next;
  }

  // step 3: add the address of new node in the last node's next pointer
  current->next = new_node;

  // step 4: add the address of last node in the prev pointer of new node.
  new_node->prev = current;
  return;
}

// delete a node at x distance from head
void deleteAtX(struct Node *head_ref, int x)
{
  struct Node *current = head_ref;

  int count = 1;
  while (count < (x - 1) && current != NULL)
  {
    current = current->next;
    count++;
  }

  current->next = current->next->next;

  current->next->prev = current;
  return;
}

int main()
{
  // create a head of DLL
  struct Node *head = (struct Node *)malloc(sizeof(struct Node));
  head->data = 2;
  head->prev = NULL;
  head->next = NULL;

  traverse(head);
  insertAtEnd(head, 3);
  traverse(head);
  insertAtEnd(head, 4);
  insertAtEnd(head, 5);
  traverse(head);

  deleteAtX(head, 3);
  traverse(head);
}
