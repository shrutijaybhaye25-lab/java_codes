import java.util.Scanner;
public class Q1second_largest {
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number");
    int n =sc.nextInt();
    int largest=-1;
    int second=-1;
    while(n>0){
        int digit=n%10;
        if(digit>largest){
            second=largest;
            largest=digit;
        }
        else if(digit<largest && digit >second){
            second=digit;
        }
        n=n/10;
    }
    if(second ==-1){
        System.out.println("error");

    }
    else{
        System.out.println(second);
    }
   }
}