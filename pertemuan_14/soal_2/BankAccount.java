package pertemuan_7.PBO_D_233040020.pertemuan_14.soal_2;

// Kelas rekening bank dengan nomor rekening final dan method final
public class BankAccount {
    private final String accountNumber; // Tidak bisa diubah setelah diinisialisasi
    protected double balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    // Method final, tidak bisa dioverride oleh subclass
    public final void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}
