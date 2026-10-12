import java.util.Scanner;
public class Q3strong_no_verification {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n =sc.nextInt();
        int temp=n;
        int sum=0;
        while(temp>0){
            int digit=temp%10;
            int fact=1;
            for(int i=1;i<=digit;i++){
                fact=fact*i;
            }
            sum=sum+fact;
            temp=temp/10;
        }
        if(sum==n){
            System.out.println(n+"is strong number");
        }
        else{
            System.out.println(n+"is not strong number");
        }
        sc.close();        
        }
    }
    

