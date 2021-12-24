public class main {
    public static void main(String[] args) {
        {
            int popUpSum = 100;
            int popUpBonusSum;
            popUpBonusSum = popUpSum / 100;
            int currentBalance = 100;
            int totalBalance;
            if (popUpSum >= 1000) {
                totalBalance = (currentBalance + popUpSum + popUpBonusSum);
                System.out.println(totalBalance + " рублей на счете");
                System.out.println(popUpBonusSum + " сумма бонусных рублей");
            } else {
                totalBalance = (currentBalance + popUpSum);
                System.out.println(totalBalance + " Ваш баланс в рублях");
            }
        }
    }
}

