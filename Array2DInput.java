public class Array2DInput { 
    public static void main(String[] args) { 
        int matrix[][] = new int [5][4]; 
        java.util.Scanner input = new java.util.Scanner(System.in); 

        System.out.println("Enter " + matrix.length + " rows and " + matrix[0].length + " columns: "); 

        for (int row = 0; row < matrix.length; row++) { 
            for (int column = 0; column < matrix[row].length; column++) { 
                matrix[row][column] = input.nextInt();  
            } 
        }

        input.close();
    } 
}
