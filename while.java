import java.util.*;
public class Loops{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int n = 0;
        while(n>=0){
            System.out.println(n);
            System.out.println("Please enter a number; negative to quit");
            n = scan.nextInt();
        }
    }
}