boolean evenDigitsOnly(int n) 
{
    boolean flag = true;
    int i=0;
    
    while(n != 0)
    {
        int num = n%10;
        n = n/10;
        
        if(num%2 == 0)
        {flag = true;
         }
         
        else
        { flag = false;
        break; 
        }
        i++;
    }
 return flag;
}
