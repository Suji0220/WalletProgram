public class Wallet {

    int min_balance = 100;
    int money = 0;

    public int addMoney(int amount)
    {
        money = money + amount;
        return money;
    }

    public void removeMoney(int amount)
    {
        if(money >= amount){
        money = money - amount;
        System.out.println("The remaining amount: " + money);
        }
        else
            System.out.println("No Sufficient balance");
    }

    public void checkBalance()
    {
        System.out.println("The balance amount is:" + money);

    }

    public void overDraw()
    {
        if(money == 0){
            money = 100;
        System.out.println("The balance amount after overdrawn: " + money);}
        else
            System.out.println("The remaining amount: " + money);
    }







}
