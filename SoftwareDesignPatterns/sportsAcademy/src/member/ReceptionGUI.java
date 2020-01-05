package member;

import access.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class ReceptionGUI extends JFrame implements ActionListener {
    public static void main(String[] args) {
        ReceptionGUI frame = new ReceptionGUI();
        frame.setVisible(true);
    }

    public ReceptionGUI() {
        //set the frame default properties
        //Design frame
        setTitle("Sports Academy");
        setSize(550, 360);
        setLocation(600, 400);
        Container pane = getContentPane();
        pane.setBackground(new Color(97, 132, 153));
        //register 'Exit upon closing' as a default close operation
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        JButton button1 = new JButton("Enter Gym");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String memberType;
                List<Member> members = new ArrayList<>();
                Member member;

                memberType = JOptionPane.showInputDialog("Membership Type");

                if(memberType.equals("Full")) {
                    member = new FullMembership();
                    member.setGymAccess(new EnterGym());
                    members.add(member);
                }else if(memberType.equals("Gym")){
                    member = new GymMembership();
                    member.setGymAccess(new EnterGym());
                    members.add(member);
                }else{
                    JOptionPane.showMessageDialog(null,"Invalid Entry");
                }

                for (Member mems : members) {
                    mems.receptionMessage();
//                    mems.useGym(memberType);
                }
            }
        });
        JButton button2 = new JButton("Enter Pool");
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String memberType;
                List<Member> members = new ArrayList<>();
                Member member;

                memberType = JOptionPane.showInputDialog("Membership Type");

                if(memberType.equals("Full")) {
                    member = new FullMembership();
                    member.setPoolAccess(new EnterPool());
                    members.add(member);
                }else if(memberType.equals("Pool")){
                    member = new PoolMembership();
                    member.setPoolAccess(new EnterPool());
                    members.add(member);
                }else{
                    JOptionPane.showMessageDialog(null,"Invalid Entry");
                }

                for (Member mems : members) {
                    mems.receptionMessage();
//                    mems.usePool(memberType);
                }
            }
        });
        JPanel panel = new JPanel();
        panel.add(button1);
        panel.add(button2);
        pane.add(panel);

    }

    /**
     * actionPreformed sorts the choice the user makes and runs the correct method once they have selected a menu item
     *
     * @param e
     */
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Quit")) {
            showMessage("Shutting down the system");
            System.exit(0);
        }
        else
            showMessage("Failed to select an option");
    }

    /**
     * utility methods to make the code simpler
     */
    public void showMessage(String s) {
        JOptionPane.showMessageDialog(null, s);
    }

    public void showMessage(JTextArea s) {
        JOptionPane.showMessageDialog(null, s);
    }


}