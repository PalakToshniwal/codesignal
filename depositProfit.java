int depositProfit(int deposit, int rate, int threshold)
{
    int years = 0;
    float x=deposit;
    while(x < threshold)
    {
        x += x * rate/100;
        years++;
    }
return years;
}
