

public  class TestAccount
{
    public static void main(String args[])
    {
        Account acc1 = new Account(121 , 60.50);
        System.out.println(acc1);
        Account acc2 = new Account(122);
        System.out.println(acc2);

        acc1.setBalance(110.50);
        System.out.println(acc1);
        System.out.println("The account Number is :" + acc1.getAccNumber());
        System.out.println("The balance :" + acc1.getBalance());
        System.out.println("The account Number is :" + acc2.getAccNumber());
        acc2.setBalance(350.70);
        System.out.println(acc2);
        System.out.println("The balance :" + acc2.getBalance());

        acc1.credit(40);
        System.out.println(acc1);
        acc1.debit(100);
        System.out.println(acc1);
        acc1.debit(60);
        System.out.println(acc1);
        acc2.credit(250);
        System.out.println(acc2);
        acc2.debit(100.50);
        System.out.println(acc2);
    }
}