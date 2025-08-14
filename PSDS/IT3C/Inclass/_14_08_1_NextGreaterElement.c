/**
 * Note: The returned array must be malloced, assume caller calls free().
 */

int* nextGreaterElement(int* nums1, int nums1Size, int* nums2, int nums2Size, int* returnSize) {
    *returnSize = nums1Size;
    int *nge = (int*) malloc(10000 * sizeof(int));
    int *stack = (int*) malloc(nums2Size * sizeof(int));
    int top = -1;

    for(int i = nums2Size - 1; i >= 0; i--) {
        while(top >= 0 && stack[top] <= nums2[i])
            top--;

        nge[nums2[i]] = top == -1 ? -1: stack[top];
        stack[++top] = nums2[i];
    }

    int *result = (int*) malloc(nums1Size * sizeof(int));

    for(int i = 0; i < nums1Size; i++)
        result[i] = nge[nums1[i]];

    free(nge);
    free(stack);
    return result;
}
