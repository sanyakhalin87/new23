public class Main {
    public static void main(String[] args) {

        int moneyBill = 121;
        int depositAmount = 1001;
        int bonuses = 0;
        int minDeposit = 1000;
        if(depositAmount >minDeposit)

        {
            bonuses = depositAmount / 100;
        }

        moneyBill=bonuses+moneyBill+depositAmount;
        System.out.println("Денег на счету:"+moneyBill+"Размер бонуса:"+bonuses);

    }
}