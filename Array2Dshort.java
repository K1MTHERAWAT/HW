public class Array2Dshort {  
    public static void main(String[] args) {  
int [][] matrix = { 
    {1 ,6 ,11 ,16 }, 
    {2 ,7 ,12 ,17 }, 
    {3 ,8 ,13 ,18 }, 
    {4 ,9, 14 ,19 }, 
    {5 ,10 ,15 ,20 } 
}; 
for (int row = 0; row < matrix.length; row++) { 
  for (int column = 0; column < matrix[row].length; column++) { 
    System.out.print(matrix[row][column] + " "); 
  } 
  System.out.println(); 
}  
    }  

} 