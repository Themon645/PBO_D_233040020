import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;

public class HelloWorldForm3 extends JFrame implements ActionListener {
  
  private JLabel label;//2
  private JButton button;
  //3
  public HelloWorldForm3() {
    label = new JLabel();
    label.setText("Hello World");
    button = new JButton("klik Me!");
    button.addActionListener(this);

    setLayout(new GridLayout(2,1));
    add(label);
    add(button);
    setTitle("My First Program");
    setVisible(true);
    setSize(300, 200);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    label.setText("Hello World, Button Clicked!");
  }
}
