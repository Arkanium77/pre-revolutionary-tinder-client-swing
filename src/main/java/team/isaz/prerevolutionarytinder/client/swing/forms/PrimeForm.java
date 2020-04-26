package team.isaz.prerevolutionarytinder.client.swing.forms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@Component
public class PrimeForm {
    private JPanel backPanel;
    private JTabbedPane tabbedPane;
    private JPanel mainPanel;
    private JPanel autorizePanel;
    private JPanel matchesPanel;
    private JTextArea profileView;
    private JButton left;
    private JButton right;
    private JLabel labelNotify1;
    private JList<String> list1;
    private JTextArea profileViewMatches;
    private JTextField username;
    private JPasswordField password;
    private JRadioButton sexFalse;
    private JRadioButton sexTrue;
    private JTextArea profileMessage;
    private JLabel usernameLabel;
    private JButton rigister;
    private JButton login;
    private JLabel passwordLabel;
    private JLabel sex;
    private JLabel labelNotify2;
    private JLabel profileMessageLabel;
    
    @Autowired
    public PrimeForm() {
        left.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
