#include <stdio.h>
int main() {
    int i;
    int v[1000000];
    printf("i = %d\n", i);
    printf("endereco de i: %p\n", &i); // &: operador de referência, dá o endereço da variável
    printf("tamanho do int para esse compilador: %d bytes\n", sizeof(i));

    printf("v = %p\n", v);
    printf("tamanho de v: %d bytes\n", sizeof(v));
    return 0;
}
