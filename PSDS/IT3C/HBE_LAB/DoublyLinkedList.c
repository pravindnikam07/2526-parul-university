#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

struct Node
{
  int data;
  struct Node *prev;
  struct Node *next;
};

struct DoublyLinkedList
{
  struct Node *head;
};

void initList(struct DoublyLinkedList *list)
{
  list->head = NULL;
}

struct Node *createNode(int val)
{
  struct Node *newNode = (struct Node *)malloc(sizeof(struct Node));
  newNode->data = val;
  newNode->prev = newNode->next = NULL;
  return newNode;
}

void insertEnd(struct DoublyLinkedList *list, int value)
{
  struct Node *newNode = createNode(value);
  if (!list->head)
  {
    list->head = newNode;
    return;
  }
  struct Node *temp = list->head;
  while (temp->next)
    temp = temp->next;
  temp->next = newNode;
  newNode->prev = temp;
}

void deleteNode(struct DoublyLinkedList *list, int value)
{
  struct Node *temp = list->head;
  if (!temp)
    return;

  if (temp->data == value)
  {
    list->head = temp->next;
    if (list->head)
      list->head->prev = NULL;
    free(temp);
    return;
  }

  while (temp && temp->data != value)
    temp = temp->next;

  if (!temp)
    return;

  if (temp->prev)
    temp->prev->next = temp->next;
  if (temp->next)
    temp->next->prev = temp->prev;
  free(temp);
}

struct Node *searchNode(struct DoublyLinkedList *list, int value)
{
  struct Node *temp = list->head;
  while (temp)
  {
    if (temp->data == value)
      return temp;
    temp = temp->next;
  }
  return NULL;
}

void traverseForward(struct DoublyLinkedList *list)
{
  struct Node *temp = list->head;
  while (temp)
  {
    printf("%d <-> ", temp->data);
    temp = temp->next;
  }
  printf("NULL\n");
}

void traverseBackward(struct DoublyLinkedList *list)
{
  struct Node *temp = list->head;
  if (!temp)
  {
    printf("NULL\n");
    return;
  }
  while (temp->next)
    temp = temp->next;
  while (temp)
  {
    printf("%d <-> ", temp->data);
    temp = temp->prev;
  }
  printf("NULL\n");
}

void reverseList(struct DoublyLinkedList *list)
{
  struct Node *curr = list->head;
  struct Node *temp = NULL;

  while (curr)
  {
    temp = curr->prev;
    curr->prev = curr->next;
    curr->next = temp;
    curr = curr->prev;
  }
  if (temp)
    list->head = temp->prev;
}

char *trim(char *str)
{
  char *end;

  while (isspace((unsigned char)*str))
    str++;

  if (*str == 0)
    return str;

  end = str + strlen(str) - 1;
  while (end > str && isspace((unsigned char)*end))
    end--;

  end[1] = '\0';
  return str;
}

void parseAndInsert(struct DoublyLinkedList *list, char *values)
{
  char *token = strtok(values, ",");
  while (token != NULL)
  {
    int val = atoi(trim(token));
    insertEnd(list, val);
    token = strtok(NULL, ",");
  }
}

int main()
{
  struct DoublyLinkedList list;
  initList(&list);

  char line[256];
  while (fgets(line, sizeof(line), stdin))
  {
    char *trimmedLine = trim(line);
    if (strlen(trimmedLine) == 0)
      continue;

    char *colon = strchr(trimmedLine, ':');
    char cmd[100], args[150];
    if (colon)
    {
      *colon = '\0';
      strcpy(cmd, trim(trimmedLine));
      strcpy(args, trim(colon + 1));
    }
    else
    {
      strcpy(cmd, trim(trimmedLine));
      args[0] = '\0';
    }

    for (int i = 0; cmd[i]; i++)
      cmd[i] = tolower(cmd[i]);

    if (strcmp(cmd, "insert") == 0)
    {
      parseAndInsert(&list, args);
      printf("List after inserts: ");
      traverseForward(&list);
    }
    else if (strcmp(cmd, "delete") == 0)
    {
      int val = atoi(args);
      deleteNode(&list, val);
      printf("List after deleting %d: ", val);
      traverseForward(&list);
    }
    else if (strcmp(cmd, "search") == 0)
    {
      int val = atoi(args);
      struct Node *found = searchNode(&list, val);
      if (found)
        printf("Value %d found in list.\n", val);
      else
        printf("Value %d not found in list.\n", val);
    }
    else if (strcmp(cmd, "traverse forward") == 0)
    {
      printf("Forward traversal: ");
      traverseForward(&list);
    }
    else if (strcmp(cmd, "traverse backward") == 0)
    {
      printf("Backward traversal: ");
      traverseBackward(&list);
    }
    else if (strcmp(cmd, "reverse") == 0)
    {
      reverseList(&list);
      printf("List after reversal: ");
      traverseForward(&list);
    }
    else
    {
      printf("Invalid command: %s\n", cmd);
    }
  }

  return 0;
}
