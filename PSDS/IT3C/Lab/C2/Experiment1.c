#include <stdio.h>
#include <stdlib.h>

// creating node struct
struct Node
{
  int data;
  struct Node *next;
};

void traverse(struct Node *head)
{
  struct Node *current = head;

  while (current != NULL)
  {
    printf("%d -> ", current->data);
    current = current->next;
  }
  printf("NULL\n");
  return;
}

void insertAtEnd(struct Node *head, int new_data)
{
  // create new node
  struct Node *new_node = (struct Node *)malloc(sizeof(struct Node));

  new_node->data = new_data;
  new_node->next = NULL;

  // traverse to the end of the list
  struct Node *current = head;
  while (current->next != NULL)
  {
    current = current->next;
  }

  // I reach to the last node of LL
  current->next = new_node;
  return;
}

void insertAgBegining(struct Node **head, int new_data)
{
  struct Node *new_node = (struct Node *)malloc(sizeof(struct Node));
  new_node->data = new_data;
  new_node->next = *head;
  *head = new_node;

  traverse(*head);
}

// searching the element in the linked list
void searchElement(struct Node *head, int search_element)
{
  struct Node *current = head;
  while (current != NULL)
  {
    if (current->data == search_element)
    {
      printf("Element %d found\n", search_element);
      return;
    }
    current = current->next;
  }
  printf("Element %d not found\n", search_element);
  return;
}

int main()
{
  // creating the head node
  struct Node *head = (struct Node *)malloc(sizeof(struct Node));
  head->data = 1;
  head->next = NULL;
  // LL: 1 -> NULL

  struct Node *second = (struct Node *)malloc(sizeof(struct Node));
  second->data = 2;
  second->next = NULL;

  head->next = second;
  // LL: 1 -> 2 -> NULL

  traverse(head);

  insertAtEnd(head, 3); // LL: 1 -> 2 -> 3 -> NULL
  insertAtEnd(head, 5);

  traverse(head);

  insertAgBegining(&head, 0);
  traverse(head);

  searchElement(head, 4);
  searchElement(head, 2);
}
