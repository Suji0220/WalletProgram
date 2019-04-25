public class Main {

    public static void main(String[] args) {

        Wallet payTMWallet = new PayTM();


        Wallet phonePe = new PhonePe();

        payTMWallet.addMoney(400);
        phonePe.addMoney(700);

        payTMWallet.removeMoney(400);
        phonePe.removeMoney(500);

        payTMWallet.checkBalance();
        phonePe.checkBalance();

        payTMWallet.overDraw();
        phonePe.overDraw();

        payTMWallet.cashBack();
        phonePe.cashBack();









        /*int totalMoney = wallet.addMoney(1000);
        System.out.println("The total money is wallet is: " + totalMoney);

        wallet.removeMoney(300);

        wallet.removeMoney(200);

        wallet.removeMoney(500);


        wallet.checkBalance();

        wallet.overDraw();*/



    }
}
