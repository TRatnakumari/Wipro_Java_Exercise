import java.util.*;
public class NumSign{
    public static void main(String args[]){
        Sytem.out.print("Enter number to check sign :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>0){
            System.out.println("Positive");
        }else if(n==0){
            System.out.println("Zero");
        }else{
            System.out.println("Negative");
        }sc.close();
    }
}