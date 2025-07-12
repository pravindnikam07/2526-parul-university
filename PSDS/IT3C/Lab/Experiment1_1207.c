#include <stdio.h>
#include <stdlib.h>

struct Node
{
  int data;
  struct Node *next;
};

// Insert a new Node at the end of the LinkedList
void insertAtEnd(struct Node *current, int new_data)
{
  // create a new node of new_data
  struct Node *new_node = (struct Node *)malloc(sizeof(struct Node));
  new_node->data = new_data;
  new_node->next = NULL;

  // check if the current node is NULL
  if (current == NULL)
  {
    current = new_node;
    return;
  }

  // traverse till the last node of linkedlist
  while (current->next != NULL)
  {
    current = current->next;
  }

  // if you reach here, it means current is pointing to the last node
  // we can assign the new node to the next of current node
  current->next = new_node;
  return;
}

// Traversing the LinkedList
void traverse(struct Node *current)
{
  // traversing on each node of linked list
  while (current != NULL)
  {
    printf("%d -> ", current->data);
    current = current->next;
  }
  printf("NULL\n");
  return;
}

// searching the node in the linked list
void search(struct Node *current, int searching_element)
{
  while (current != NULL)
  {
    int current_data = current->data;
    // check if the current node data is matching to searcing element
    if (current_data == searching_element)
    {
      printf("Element %d is found in the linked list.\n", searching_element);
      return;
    }
    current = current->next;
  }
  printf("Element %d is not found in the linked list.\n", searching_element);
  return;
}

// Deleting node from x distance in the linked list
void deleteNode(struct Node *current, int x)
{
  if (current == NULL)
  {
    return;
  }

  int i = 1;
  while (i < x)
  {
    if (current->next == NULL)
    {
      return;
    }
    current = current->next;
    i++;
  }

  current->next = current->next->next;
  return;
}

int main()
{
  // creating a head node.
  struct Node *head = (struct Node *)malloc(sizeof(struct Node));
  head->data = 1;
  head->next = NULL;
  // 1

  // inserting nodes at the end of the linked list
  insertAtEnd(head, 2); // 1 -> 2
  insertAtEnd(head, 3); // 1 -> 2 -> 3
  insertAtEnd(head, 4); // 1 -> 2 -> 3 -> 4
  insertAtEnd(head, 23);
  insertAtEnd(head, 454);
  insertAtEnd(head, 12);
  insertAtEnd(head, 5);

  // traversing the linked list
  traverse(head);

  // searching the element in the linked list
  // int searching_element = 4;
  // search(head, searching_element);
  // search(head, 10);
  // search(head, 242);
  // search(head, 454);

  // head->next : 2;
  // head->next->next : 3;

  // deleting head node
  // head = head->next;
  // traverse(head);

  // deleting node from x distance
  int x = 10;
  deleteNode(head, x);
  traverse(head);
}
