import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        if(x>0){
            if(y>0){
                System.out.print(1);
            }
            else{
                System.out.print(4);
            }
        }
        
        else{
            if(y > 0) {
                System.out.print(2);
            }
            else{
                System.out.print(3);
            }
        }
    }
}