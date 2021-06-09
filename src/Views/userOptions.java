package Views;

import javax.swing.*;
import java.awt.*;
import java.io.Serializable;

public class userOptions extends JFrame implements Serializable {
    private static JLabel userLabel;
    private static JButton button;
    private static JLabel success;
    private static final long serialVersionUID = 68L;

    Object user;

//    public userOptions(Object user){
//        this.user = user;
//    }

    public userOptions(Object user) {
        this.user = user;
        JLabel label = new JLabel();
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setLayout(null);

        frame.setTitle("User Options");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(400,400));

        JLabel userNameLabel = new JLabel("Select An Option:");
        userNameLabel.setBounds(80,80,180,25);
        panel.add(userNameLabel);

        JButton button = new JButton("Buy/Sell");
        button.setBounds(100,120,150, 20);
        panel.add(button);

        JButton buttonUser = new JButton("Updates");
        buttonUser.setBounds(100,150,150, 20);
        panel.add(buttonUser);

        JButton tradeBtn = new JButton("Create Trade");
        tradeBtn.setBounds(100,180,150, 20);
        panel.add(tradeBtn);

        JButton buttonAnother = new JButton("Asset Graph");
        buttonAnother.setBounds(100,210,150, 20);
        panel.add(buttonAnother);

        JButton btnOther = new JButton("Change Password");
        btnOther.setBounds(100,240,150, 20);
        panel.add(btnOther);

        JButton buttonLogOut = new JButton("Log Out");
        buttonLogOut.setBounds(100,270,150, 20);
        panel.add(buttonLogOut);


        frame.getContentPane().add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }
//
//    public static void main(String[] args){
//
//        new userOptions();
//    }
}
