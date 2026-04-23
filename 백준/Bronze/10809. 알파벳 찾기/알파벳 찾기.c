#include <stdio.h>

int main()
{
    char word[101] = { 0 };
    char alp[26]; 
    int i;
    scanf("%s", word);
    for (i = 0; i < 26; i++) 
        alp[i] = -1;
    for (i = 0; word[i]; i++)
    {
        if (alp[word[i] - 'a'] == -1)
            alp[word[i] - 'a'] = i;
    }
    
    for (i = 0; i < 26; i++)
        printf("%d ", alp[i]);
}