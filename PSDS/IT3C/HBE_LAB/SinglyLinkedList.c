#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

#define MAX_LINE 256

// Node structure
struct Node
{
  int data;
  struct Node *next;
};

// Trim whitespace from string
char *trim(char *str)
{
  while (isspace((unsigned char)*str))
    str++;
  if (*str == 0)
    return str;
  char *end = str + strlen(str) - 1;
  while (end > str && isspace((unsigned char)*end))
    end--;
  end[1] = '\0';
  return str;
}

// Insert at end
struct Node *insertEnd(struct Node *head, int value)
{
  struct Node *newNode = (struct Node *)malloc(sizeof(struct Node));
  newNode->data = value;
  newNode->next = NULL;
  if (!head)
    return newNode;
  struct Node *cur = head;
  while (cur->next)
    cur = cur->next;
  cur->next = newNode;
  return head;
}

// Delete first occurrence
struct Node *deleteNode(struct Node *head, int value)
{
  if (!head)
    return NULL;
  if (head->data == value)
  {
    struct Node *temp = head;
    head = head->next;
    free(temp);
    return head;
  }
  struct Node *prev = head, *cur = head->next;
  while (cur)
  {
    if (cur->data == value)
    {
      prev->next = cur->next;
      free(cur);
      return head;
    }
    prev = cur;
    cur = cur->next;
  }
  return head;
}

// Search for value
int searchNode(struct Node *head, int value)
{
  struct Node *cur = head;
  while (cur)
  {
    if (cur->data == value)
      return 1;
    cur = cur->next;
  }
  return 0;
}

// Reverse the list
struct Node *reverseList(struct Node *head)
{
  struct Node *prev = NULL, *cur = head;
  while (cur)
  {
    struct Node *next = cur->next;
    cur->next = prev;
    prev = cur;
    cur = next;
  }
  return prev;
}

// Display list
void displayList(struct Node *head)
{
  struct Node *cur = head;
  while (cur)
  {
    printf("%d -> ", cur->data);
    cur = cur->next;
  }
  printf("NULL\n");
}

// Free memory
void freeList(struct Node *head)
{
  while (head)
  {
    struct Node *temp = head;
    head = head->next;
    free(temp);
  }
}

// Parse comma-separated values and insert into list
void parseAndInsert(struct Node **head, char *values)
{
  char *token = strtok(values, ",");
  while (token != NULL)
  {
    int val = atoi(trim(token));
    *head = insertEnd(*head, val);
    token = strtok(NULL, ",");
  }
}

int main()
{
  struct Node *head = NULL;
  char line[MAX_LINE];
  char *pos;

  // INSERT
  if (fgets(line, sizeof(line), stdin))
  {
    pos = strchr(line, ':');
    if (pos)
    {
      char *values = trim(pos + 1);
      parseAndInsert(&head, values);
    }
  }
  printf("List after inserts: ");
  displayList(head);

  // DELETE
  if (fgets(line, sizeof(line), stdin))
  {
    pos = strchr(line, ':');
    if (pos)
    {
      int val = atoi(trim(pos + 1));
      head = deleteNode(head, val);
      printf("List after deleting %d: ", val);
      displayList(head);
    }
  }

  // SEARCH
  if (fgets(line, sizeof(line), stdin))
  {
    pos = strchr(line, ':');
    if (pos)
    {
      int val = atoi(trim(pos + 1));
      if (searchNode(head, val))
      {
        printf("Value %d found in list.\n", val);
      }
      else
      {
        printf("Value %d not found in list.\n", val);
      }
    }
  }

  // REVERSE
  if (fgets(line, sizeof(line), stdin))
  {
    char *cmd = trim(line);
    if (strcasecmp(cmd, "reverse") == 0)
    {
      head = reverseList(head);
      printf("List after reversal: ");
      displayList(head);
    }
  }

  freeList(head);
  return 0;
}
