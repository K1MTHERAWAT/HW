import java.util.Scanner; 

 

public class BasicCalculation { 

 

    public static void main(String[] args) { 

         

        Scanner input = new Scanner(System.in); 

        System.out.println("Enter the first number:"); 

        int n = input.nextInt(); 

         

        System.out.println("Enter the operation (+, -, *, /):"); 

        String operation = input.next(); 

         

        System.out.println("Enter the second number:"); 

        int m = input.nextInt(); 

         

        if (operation.equals("+")) { 

            System.out.println((n + m)); 

             

        } else if (operation.equals("-")) { 

            System.out.println(+ (n - m)); 

             

        } else if (operation.equals("*")) { 

            System.out.println((n * m)); 

             

        } else if (operation.equals("/")) { 

            if (m != 0) { 

                System.out.println((double) n / m); 

            } else { 

                System.out.println("Error"); 

            } 

        }  

    } 

} 

 