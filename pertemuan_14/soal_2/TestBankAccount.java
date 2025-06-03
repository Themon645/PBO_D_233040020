package pertemuan_7.PBO_D_233040020.pertemuan_14.soal_2;

public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("123456789");
        acc.deposit(100000);
        acc.displayAccountInfo();

        SavingsAccount sav = new SavingsAccount("987654321");
        sav.deposit(50000);
        sav.displayAccountInfo();
        sav.displaySavingsType();
    }
}
