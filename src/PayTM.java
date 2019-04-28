public class PayTM extends Wallet {

    public  void addMoney(int amount)
    {
        money = money + amount;
        System.out.println("The outstanding balance amount for PayTM is: " + money);
    }

    public void removeMoney(int amount)
    {
        if(money >= amount){
            balaceAmount = money - amount;
            System.out.println("The remaining amount for PayTM: " + balaceAmount);
        }
        else
            System.out.println("No Sufficient balance");
    }

    public void cashBack()
    {
        if (balaceAmount >= 300)
            System.out.println("PhonePay pays cashback of 17%");

        else
            System.out.println("No cashback");
    }


}
