package member;

import javax.swing.*;

public class GymMembership extends Member {

    @Override
    public void access() {
        System.out.println("Gym Access");
    }

    public GymMembership(){
        status = "GymMembership";
    }

    public double cost(){
        return 15.00;
    }

    @Override
    public void receptionMessage() {
        JOptionPane.showMessageDialog(null, "This member can use the gym");
    }
}
