public class PhonePe extends Wallet {

    public  void addMoney(int amount)
    {
        money = money + amount;
        System.out.println("The outstanding balance amount for PhonePe is: " + money);
    }
    public void removeMoney(int amount)
    {
        if(money >= amount){
            money = money - amount;
            System.out.println("The remaining amount for PhonePe is: " + money);
        }
        else
            System.out.println("No Sufficient balance");
    }

    public void cashBack()
    {
        if (money >= 500)
        System.out.println("Cash back is done successfully to 5%");

        else
            System.out.println("No discount");
    }

}
