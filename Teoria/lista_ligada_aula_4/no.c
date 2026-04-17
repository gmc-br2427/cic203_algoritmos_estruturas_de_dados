#include <stdio.h>
#include <stdlib.h>
typedef struct no { //typedef é pra colocar um alias no nó
    int info;
    struct no * proximo;
} tipo_no;

int main () {
    struct no no1;
    tipo_no no2;
    struct no *p1;
    tipo_no *p2;
    
    no1.info = 10;
    no1.proximo = &no2; //endereço do no2

    printf ("tamanho do no: %d\n", sizeof(tipo_no));
    printf ("no1.info: %d, no1.proximo: %p\n", no1.info, no1.proximo);

    no1.proximo->info = 20;
    printf ("no2.info: %d, no2.proximo: %p\n", no2.info, no2.proximo);
    
    printf ("p1: %p\n", p1);
    p1->info = 100;
    printf ("p1->info: %d\n", p1->info);
    printf ("foi");

    p2 = (tipo_no *) malloc (sizeof(tipo_no));
    return 0;
}