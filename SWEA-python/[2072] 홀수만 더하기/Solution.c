#include <stdio.h>

int main(void) {
    int T;
    scanf("%d", &T);

    for (int test_case = 1; test_case <= T; test_case++) {
        int sum = 0;
        int num;

        for (int i = 0; i < 10; i++) {
            scanf("%d", &num);
            if (num % 2 != 0) { 
                sum += num;
            }
        }

        printf("#%d %d\n", test_case, sum);
    }

    return 0;
}