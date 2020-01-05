package member;

import javax.swing.*;

public class FullMembership extends Member {

    @Override
    public void access() {
        System.out.println("Full Access");
    }

    public FullMembership(){
        status = "FullMembership";
    }

    public double cost(){
        return 27.00;
    }

    @Override
    public void receptionMessage() {
        JOptionPane.showMessageDialog(null, "Full members can go everywhere");
    }
}
