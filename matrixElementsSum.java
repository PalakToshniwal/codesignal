int matrixElementsSum(int[][] matrix) 
{
    int count=0;
  for(int i=0; i<matrix.length; i++)
  {
      for(int j=0; j<matrix[0].length; j++)
      {
          if(matrix[i][j] == 0)
          {
              if(i+1 < matrix.length)
                matrix[i+1][j]=0;
              if(i+2 < matrix.length)  
                matrix[i+2][j]=0;
          }
          count += matrix[i][j];
      }
  }
  return count;
}
