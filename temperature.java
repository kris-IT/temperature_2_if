import java.util.Scanner;

/* 
Тепло или холодно
*/

public class Solution {
    public static void main(String[] args) {
        String cold = "на улице холодно";
        String warm = "на улице тепло";
       Scanner scan = new Scanner(System.in);
      
       int temperature = scan.nextInt();
       if (temperature < 0)
       
       System.out.println("на улице холодно");
       
       if (temperature >= 0)
       System.out.println("на улице тепло"); 
    
    }

}