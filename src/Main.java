public class Main {

    public static void main(String[] args) {

        Wallet wallet = new Wallet();
        int totalMoney = wallet.addMoney(1000);
        System.out.println("The total money is wallet is: " + totalMoney);

        wallet.removeMoney(300);

        wallet.removeMoney(200);

        wallet.removeMoney(500);


        wallet.checkBalance();

        wallet.overDraw();



    }
}
