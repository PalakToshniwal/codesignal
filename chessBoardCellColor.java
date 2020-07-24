boolean chessBoardCellColor(String cell1, String cell2) 
{
    char x1 = cell1.charAt(0), y1 = cell1.charAt(1),
         x2 = cell2.charAt(0), y2 = cell2.charAt(1);
         
         return ((x2-x1)% 2 == 0 && (y2-y1)%2 == 0 || (x2-x1)% 2 != 0 && (y2-y1)%2 != 0);
}
