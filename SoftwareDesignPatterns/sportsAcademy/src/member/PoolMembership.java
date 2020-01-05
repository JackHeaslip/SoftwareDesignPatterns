package member;

import javax.swing.*;

public class PoolMembership extends Member {

    @Override
    public void access() {
        System.out.println("Pool Access");
    }

    public PoolMembership(){
        status = "PoolMembership";
    }

    public double cost(){
        return 9.00;
    }

    @Override
    public void receptionMessage() {
        JOptionPane.showMessageDialog(null, "This member can use the pool");
    }
}
