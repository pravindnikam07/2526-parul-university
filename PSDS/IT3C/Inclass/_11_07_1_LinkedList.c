#include <stdio.h>
#include <stdlib.h>

struct Node
{
    int data;
    struct Node *next;
};

int main()
{
    struct Node *head;

    // Static allocation of a node
    // head->data = 20;
    // head->next = NULL;

    // Dynamic allocation of a node
    head = malloc(sizeof(struct Node));
    head->data = 20;
    head->next = NULL;

    struct Node *second = malloc(sizeof(struct Node));
    struct Node *third = malloc(sizeof(struct Node));

    second->data = 30;
    third->data = 40;

    head->next = second;
    second->next = third;
    third->next = NULL;

    // Traversing the linked list

    struct Node *current = head;

    while (current != NULL)
    {
        printf("%d => ", current->data);
        current = current->next;
    }
    printf("NULL\n:");
}