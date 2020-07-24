int circleOfNumbers(int n, int firstNum) 
{
    int x = n/2;
    
    if(x > firstNum)
     return x+firstNum;
    else
     return firstNum-x; 

}
