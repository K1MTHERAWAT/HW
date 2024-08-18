package divided;

import java.util.Scanner;

public class Divided {


    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("NumBer: ");
        double M = input.nextDouble();
        int maii = 0;
        
        for(int i = 1 ; i <= M; i++){
            maii = i;
            if(M%maii == 0){
                System.out.println(maii);
            }
        }
                
    }
    
}
