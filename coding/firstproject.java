
public class firstproject {
    public static void main(String[] args) {


        import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

        public class RegistrationForm extends JFrame implements ActionListener {

            // Declare form components
            JLabel labelTitle, labelName, labelEmail, labelPassword, labelGender, labelPhone;
            JTextField textName, textEmail, textPhone;
            JPasswordField fieldPassword;
            JRadioButton male, female;
            ButtonGroup genderGroup;
            JButton submit;

            public RegistrationForm() {
                // Frame title
                setTitle("Registration Form");
                setSize(400, 400);
                setLayout(null);
                setDefaultCloseOperation(EXIT_ON_CLOSE);

                // Title
                labelTitle = new JLabel("User Registration");
                labelTitle.setBounds(120, 10, 200, 30);
                labelTitle.setFont(new Font("Arial", Font.BOLD, 18));
                add(labelTitle);

                // Name
                labelName = new JLabel("Name:");
                labelName.setBounds(50, 60, 100, 25);
                add(labelName);
                textName = new JTextField();
                textName.setBounds(150, 60, 180, 25);
                add(textName);












            }
    }
}
