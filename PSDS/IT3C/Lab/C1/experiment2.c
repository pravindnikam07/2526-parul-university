#include <stdio.h>
#include <stdlib.h>

// creating the struct for DLL
struct Node
{
  int data;          // to store the current node data
  struct Node *prev; // to store the previous node address
  struct Node *next; // to store the next node address
};

// creating the traverse method
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

// inserting the node at the end
void insertAtEnd(struct Node *head_ref, int new_data)
{
  // creating a new node
  struct Node *new_node = (struct Node *)malloc(sizeof(struct Node));
  new_node->data = new_data;
  new_node->next = NULL;
  new_node->prev = NULL;

  // check if head is null or not
  if (head_ref == NULL)
  {
    head_ref = new_node;
  }

  // iterating on the current LL and reach to last node
  struct Node *current = head_ref;
  while (current->next != NULL)
  {
    current = current->next;
  }

  // setting up the address of new_node into current node
  current->next = new_node;

  // setting up the address of previous node to the new node
  new_node->prev = current;

  return;
}

// inserting the node at the begining
void insertAtBeginig(struct Node **head_ref, int new_data)
{
  struct Node *new_node = (struct Node *)malloc(sizeof(struct Node));
  new_node->data = new_data;
  new_node->next = NULL;
  new_node->prev = NULL;

  struct Node *current = *head_ref;
  new_node->next = current;
  current->prev = new_node;

  // new_node->next = *head_ref;
  // *head_ref->prev = new_node;
  *head_ref = new_node;

  traverse(*head_ref);
  return;
}

// searching in the DLL
void searchElement(struct Node *head_ref, int seaching_element)
{
  // chech if head is null or not
  if (head_ref == NULL)
  {
    printf("Element %d is not found...", seaching_element);
    return;
  }

  struct Node *current = head_ref;

  while (current != NULL)
  {
    if (current->data == seaching_element)
    {
      printf("Element %d is found...", seaching_element);
      return;
    }
    current = current->next;
  }
  printf("Element %d is not found...", seaching_element);
  return;
}

// creating the main method
int main()
{
  // create the head node
  struct Node *head = (struct Node *)malloc(sizeof(struct Node));
  head->data = 3;
  head->prev = NULL;
  head->next = NULL;

  traverse(head);
  insertAtEnd(head, 5);
  insertAtEnd(head, 7);
  traverse(head);

  insertAtBeginig(&head, 2);
  traverse(head);

  searchElement(head, 4);
  searchElement(head, 7);
}
