import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Student_Academic_Management_System extends JFrame {

    private JTextField nameField;
    private JTextField mobileField;
    private JTextField emailField;
    private JTextField fatherField;
    private JButton submitButton;

    public Student_Academic_Management_System() {
        // Set up the frame
        setTitle("Student Academic Management System");
        setSize(250, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2));

        // Create and add labels and text fields
        add(new JLabel("Enter Your Name: "));
        nameField = new JTextField();
        add(nameField);

        add(new JLabel("Enter Your Mobile No.: "));
        mobileField = new JTextField();
        add(mobileField);

        add(new JLabel("Enter Your E-Mail ID: "));
        emailField = new JTextField();
        add(emailField);

        add(new JLabel("Enter Your Father's Name: "));
        fatherField = new JTextField();
        add(fatherField);

        submitButton = new JButton("Submit");
        add(submitButton);

        // Add button click event
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleSubmit();
            }
        });
    }

    private void handleSubmit() {
        String name = nameField.getText();
        String mobile = mobileField.getText();
        String email = emailField.getText();
        String father = fatherField.getText();

        // Display or process the data
        JOptionPane.showMessageDialog(this, 
            "Name: " + name + "\n" +
            "Mobile No.: " + mobile + "\n" +
            "E-Mail ID: " + email + "\n" +
            "Father's Name: " + father);
    }

    public static void main(String[] args) {
        // Create and display the form
        SwingUtilities.invokeLater(() -> {
            Student_Academic_Management_System frame = new Student_Academic_Management_System();
            frame.setVisible(true);
        });
    }
}
