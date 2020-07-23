int[][] boxBlur(int[][] image)
{
  int sum=0;
  int rows = image.length-2;
  int cols = image[0].length-2;
  int nImage[][] = new int[rows][cols];
  
  for(int i=1; i<=rows; i++)
  {
      for(int j=1; j<=cols; j++)
      {
        sum = image[i - 1][j - 1] + image[i - 1][j] + image[i - 1][j + 1]+
        image[i][j - 1] + image[i][j] + image[i][j + 1]+
        image[i + 1][j - 1] + image[i + 1][j] + image[i + 1][j + 1];
        
        nImage[i-1][j-1] = sum/9;
      }
  }
  return nImage;
}
