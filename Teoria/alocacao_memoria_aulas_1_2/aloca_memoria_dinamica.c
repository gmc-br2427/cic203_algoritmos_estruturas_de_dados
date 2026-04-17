#include <stdio.h>
#include <stdlib.h>
int main () {
    int *v;
    while ((v = (int *)malloc(50000000 * sizeof(int))) != NULL) // pra estourar a memória msm
        printf ("passou: v = %p\n", v);
    return 0;
}