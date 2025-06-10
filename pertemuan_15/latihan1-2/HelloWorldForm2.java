import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorldForm2 extends JFrame{ //1
  private JLabel label; //2

  //3
  public HelloWorldForm2() {
    label = new JLabel();
    label.setText("Hello Dunia!");

    add(label);
    setTitle("Program Pertama");

    setVisible(true);
    setSize(300, 200);
  }
}
