package task_4.I_classes_using_Inheritance;

// Базовый класс BankAccount
class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Депозит: " + amount + " | Новый баланс: " + balance);
        } else {
            System.out.println("Сумма депозита должна быть положительной.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Снятие: " + amount + " | Остаток: " + balance);
        } else {
            System.out.println("Недостаточно средств или неверная сумма снятия.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

// Подкласс SavingsAccount
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(double initialBalance, double interestRate) {
        super(initialBalance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = balance * interestRate / 100;
        deposit(interest);
        System.out.println("Начислены проценты: " + interest + " | Новый баланс: " + balance);
    }
}

// Подкласс CurrentAccount
class CurrentAccount extends BankAccount {
    public CurrentAccount(double initialBalance) {
        super(initialBalance);
    }

}

// Подкласс FixedDepositAccount
class FixedDepositAccount extends BankAccount {
    private double penaltyFee;
    private boolean isWithdrawAllowed;

    public FixedDepositAccount(double initialBalance, double penaltyFee) {
        super(initialBalance);
        this.penaltyFee = penaltyFee;
        this.isWithdrawAllowed = false; // Снятие запрещено
    }

    public void allowWithdrawal() {
        isWithdrawAllowed = true;
    }

    public void withdraw(double amount) {
        if (isWithdrawAllowed) {
            super.withdraw(amount);
        } else {
            System.out.println("Снятие средств запрещено. Для снятия необходимо активировать разрешение.");
        }
    }

    public void applyPenalty() {
        balance -= penaltyFee;
        System.out.println("Применен штраф: " + penaltyFee + " | Новый баланс: " + balance);
    }
}