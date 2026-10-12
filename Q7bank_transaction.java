public class Q7bank_transaction {
    private String name;
    private  int accountnumber;
    private  double balance;

    Q7bank_transaction(String n,int acc,double b){
        if(b>0){
            System.out.println("invalid");
        }

        name=n;
        accountnumber=acc;
        balance=b;
    }
    void deposit(double amount)
    {
        if (amount<=0) 
            {
            System.out.println("invalid");
            
        }
        else{
            balance+=amount;
            System.out.println("suceessful");
        }
    }
    void withdrawal(double amount)
    {
        if(amount<0){
            System.out.println("invalid");
        }else if (amount>balance) {
            System.out.println("insufficent balance");
            
        }else{
            balance-=amount;
            System.out.println("withdeawal successfull");
        }
    }
    void display(){
        System.out.println(name);
        System.out.println(accountnumber);
        System.out.println(balance);
    }
    public static void main(String args[]){
        Q7bank_transaction b=new Q7bank_transaction("gayatri", 101, 50000);
        b.deposit(1000);
        b.withdrawal(2000);
        b.display();
    }
}

