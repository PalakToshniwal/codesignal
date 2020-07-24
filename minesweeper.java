int[][] minesweeper(boolean[][] m) 
{
    int count=0;
    int rows = m.length;
    int cols = m[0].length;
    int[][] ar = new int[rows][cols];
    
  for(int i=0; i<rows; i++)
  {
      for(int j=0; j<cols; j++)
      {
          for(int k = -1; k<2 ; k++)
          {
              for(int l = -1; l<2; l++)
              {
                  if(i+k >= 0 && i+k < rows && j+l >=0 && j+l <cols )
                  {
                      if(i+k == i && j+l == j)
                      continue;
                      
                      if(m[i+k][j+l] == true)
                       count++;
                  }
              }
          }
          ar[i][j] = count;
          count=0;
      }
  }
  return ar;
}
