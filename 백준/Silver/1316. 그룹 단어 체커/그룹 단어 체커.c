#include <stdio.h>

int main()
{
	char str[100][101] = {'\0'};    
   int n, i, j, cnt = 0;
   int flags[26] = {0, };
   scanf("%d", &n);
   for (i = 0 ; i < n; i++)
   {
    	scanf("%s", str[i]);
      for (j = 0; j < 26; j++) flags[j] = 0;    
      for (j = 0; j < strlen(str[i]); j++)
      {
        	if (j > 0 && str[i][j-1] == str[i][j])
           {
            	if (j == strlen(str[i]) - 1)
               {
                	cnt++;
                  break;
               }
               else 
                  continue;
            }
            else
            {
            	if (flags[str[i][j]-'a'] == 1)
                	break;
               else
               {
                	flags[str[i][j]-'a'] = 1;
                  if( j==strlen(str[i]) - 1)
                  {
                    	cnt++;
                     break;
                  }
               }
            }
        }
    }
    printf("%d\n", cnt);
}