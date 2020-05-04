public class Main {
    public static void main(String[] args) {
        int AccountBalance = 100;
        int ReplenishmentAmount = 1500;
        int CostPerBonus = 100;
        int BonusAmount;

        if (ReplenishmentAmount > 1000) {
            BonusAmount = ReplenishmentAmount / CostPerBonus;
        } else {
            BonusAmount = 0;
        }

        int AccountBalanceAtferReplenishment = AccountBalance + ReplenishmentAmount + BonusAmount;

        System.out.println(BonusAmount);
        System.out.println(AccountBalanceAtferReplenishment);

    }
}
