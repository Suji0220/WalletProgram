public abstract class Wallet {

    int min_balance = 100;
    int money = 0;
    int balaceAmount = 0;

    public void addMoney(int amount){};
    public void removeMoney(int amount){};

    public void cashBack(){};


    public void checkBalance()
    {
        System.out.println("The balance amount is:" + balaceAmount);

    }

    public void overDraw()
    {
        if(balaceAmount == 0){
            money = 100;
        System.out.println("The balance amount overdrawn successfully: " + money);}
        else
            System.out.println("Not Required as there is sufficient balance");
    }







}
