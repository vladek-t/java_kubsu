package task_4.I_classes_using_Inheritance;

// Класс Bank для управления счетами клиентов
class Bank {
    public static void main(String[] args) {
        // Создание различных типов счетов
        SavingsAccount savingsAccount = new SavingsAccount(1000, 5);
        CurrentAccount currentAccount = new CurrentAccount(1500);
        FixedDepositAccount fixedDepositAccount = new FixedDepositAccount(2000, 50);

        // Депозиты и снятия
        savingsAccount.deposit(200);
        savingsAccount.addInterest();
        savingsAccount.withdraw(100);

        currentAccount.deposit(300);
        currentAccount.withdraw(100);

        fixedDepositAccount.deposit(500);
        fixedDepositAccount.withdraw(100); // Снятие запрещено
        fixedDepositAccount.allowWithdrawal(); // Разрешаем снятие
        fixedDepositAccount.withdraw(100); // Теперь снятие возможно
        fixedDepositAccount.applyPenalty(); // Применение штрафа
    }
}