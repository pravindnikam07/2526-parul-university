#include <stdio.h>
#include <stdlib.h>

#define SIZE 10

// Linked list node
typedef struct Node
{
  int key;
  struct Node *next;
} Node;

Node *hashTable[SIZE];

// Hash function
int hash(int key)
{
  return key % SIZE;
}

// Insert into hash table
void insert(int key)
{
  int index = hash(key);
  Node *newNode = (Node *)malloc(sizeof(Node));
  newNode->key = key;
  newNode->next = hashTable[index];
  hashTable[index] = newNode;
}

// Search
int search(int key)
{
  int index = hash(key);
  Node *temp = hashTable[index];
  while (temp)
  {
    if (temp->key == key)
      return 1;
    temp = temp->next;
  }
  return 0;
}

// Display
void display()
{
  for (int i = 0; i < SIZE; i++)
  {
    printf("%d: ", i);
    Node *temp = hashTable[i];
    while (temp)
    {
      printf("%d -> ", temp->key);
      temp = temp->next;
    }
    printf("NULL\n");
  }
}

int main()
{
  insert(15);
  insert(25);
  insert(35);
  insert(20);

  display();

  printf("Search 25: %s\n", search(25) ? "Found" : "Not Found");
  printf("Search 99: %s\n", search(99) ? "Found" : "Not Found");

  return 0;
}
