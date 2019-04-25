public class PayTM extends Wallet {

    public  void addMoney(int amount)
    {
        money = money + amount;
        System.out.println("The outstanding balance amount for PayTM is: " + money);
    }

    public void removeMoney(int amount)
    {
        if(money >= amount){
            money = money - amount;
            System.out.println("The remaining amount for PayTM: " + money);
        }
        else
            System.out.println("No Sufficient balance");
    }

    public void cashBack()
    {
        if (money >= 300)
            System.out.println("Cash back is done successfully to 7%");

        else
            System.out.println("No discount");
    }


}
