import javax.swing.*;
import java.awt.event.*;

public class PenjumlahanGUI {
    public static void main(String[] args) {
        // Membuat frame
        JFrame frame = new JFrame("Penjumlahan Dua Angka");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Membuat textfield untuk input angka pertama dan kedua
        JTextField textField1 = new JTextField();
        textField1.setBounds(30, 20, 100, 25);
        frame.add(textField1);

        JTextField textField2 = new JTextField();
        textField2.setBounds(150, 20, 100, 25);
        frame.add(textField2);

        // Membuat tombol untuk menjumlahkan
        JButton button = new JButton("Jumlahkan");
        button.setBounds(80, 60, 120, 30);
        frame.add(button);

        // Aksi ketika tombol ditekan
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int angka1 = Integer.parseInt(textField1.getText());
                    int angka2 = Integer.parseInt(textField2.getText());
                    int hasil = angka1 + angka2;
                    JOptionPane.showMessageDialog(frame, "Hasil: " + hasil);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Masukkan angka yang valid!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.setLocationRelativeTo(null); // Tampilkan di tengah layar
        frame.setVisible(true);
    }
}

