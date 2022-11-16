
public  class Account
{
    private  int accNumber;
    private  double balance;

    public Account(int accNumber , double balance){
        this.accNumber=accNumber;
        this.balance=balance;
    }

    public  Account(int accNumber){
        this.accNumber = accNumber;
        this.balance = 0.0;
    }

    public  int getAccNumber(){
        return  this.accNumber;
    }

    public  double getBalance(){
        return  this.balance;
    }

    public  void  setBalance(double balance){
        this.balance =balance;
    }
    public void credit(double amount){
        balance += amount;
    }

    public  void  debit(double amount){
        if (balance < amount){
            System.out.println("Amount withdrawn exceeds the current balance!");
        }else {
            balance -=amount;
        }

    }

    public  String toString(){
        return String.format("A/C no:%d, Balance:%.2f", accNumber,balance);
    }

}