public class PhonePe extends Wallet {


    public  void addMoney(int amount)
    {
        money = money + amount;
        System.out.println("The outstanding balance amount for PhonePe is: " + money);
    }
    public void removeMoney(int amount)
    {
        if(money >= amount){
            balaceAmount = money - amount;
            System.out.println("The remaining amount for PhonePe is: " + balaceAmount);
        }
        else
            System.out.println("No Sufficient balance");
    }

    public void cashBack()
    {
        if (balaceAmount >= 100)
        System.out.println("PhonePay pays cashback of 10%");

        else
            System.out.println("No cashback");
    }

}
