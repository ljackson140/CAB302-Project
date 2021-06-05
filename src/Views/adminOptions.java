package Views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;

public class adminOptions extends JFrame implements Serializable {

    private static JLabel userLabel;
    private static JButton button;
    private static JLabel success;
    private static final long serialVersionUID = 63L;

    public adminOptions() {
        JLabel label = new JLabel();
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setLayout(null);

        frame.setTitle("Admin Options");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(400,400));

        JLabel userNameLabel = new JLabel("Select An Option:");
        userNameLabel.setBounds(80,80,180,25);
        panel.add(userNameLabel);

        JButton button = new JButton("Create Organisational Units");
        button.setBounds(100,120,190, 20);
        panel.add(button);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new addingOrganisationList();
                System.exit(0);
            }
        });

        JButton buttonUser = new JButton("Edit Organisational Credits");
        buttonUser.setBounds(100,150,190, 20);
        panel.add(buttonUser);

        JButton buttonOptions = new JButton("Edit Assest");
        buttonOptions.setBounds(100,180,190, 20);
        panel.add(buttonOptions);

        JButton buttonAnother = new JButton("Add New User");
        buttonAnother.setBounds(100,210,190, 20);
        panel.add(buttonAnother);

        JButton buttonLogOut = new JButton("Log Out");
        buttonLogOut.setBounds(100,240,190, 20);
        panel.add(buttonLogOut);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }

    public static void main(String[] args){

        new adminOptions();
    }
}
