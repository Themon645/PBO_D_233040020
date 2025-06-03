package pertemuan_7.PBO_D_233040020.pertemuan_14.soal_2;

public class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber) {
        super(accountNumber);
    }

    // Subclass yang mencoba override method final (AKAN ERROR jika di-uncomment)
/*
public class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber) {
        super(accountNumber);
    }

    // ERROR: Cannot override the final method from BankAccount
    // @Override
    // public void displayAccountInfo() {
    //     System.out.println("Override tidak diperbolehkan!");
    // }
}
*/
    // Cara yang benar: Tambahkan method baru khusus subclass jika perlu
    // Method khusus subclass tanpa override method final
    public void displaySavingsType() {
        System.out.println("Ini adalah rekening tabungan.");
    }
}
