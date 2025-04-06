class Account {
    private String  Hname ;
    private String accountNo;
    private double balance ;
        public void  setHname(String name)
        {
            this.Hname=name ;
        }
    public String getHname()
    {
        return Hname ;
    }
    public void setBalance(double balance)
        {
            this.balance = balance ;
        }
        public double getBalance()
    {
        return balance ;
    }
}
class Encapsulation{
public static void main(String [] args){
Account ac = new Account();
ac.setHname("hailemariam");
System.out.println ("The name of the accout holder is : "+ac.getHname());
ac.setBalance(45000);
System.out.println ("The balance of the given account is : "+ac.getBalance());
}

}