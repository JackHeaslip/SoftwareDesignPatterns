package member;

import access.GymAccess;
import access.PoolAccess;

import javax.swing.*;

public abstract class Member {

    abstract void access();

    public String status = "status unknown";

    public String getStatus() {
        return status;
    }

    public abstract double cost();

    private GymAccess gymAccess;
    private PoolAccess poolAccess;

    public void setGymAccess(GymAccess gymAccess){
        this.gymAccess = gymAccess;
    }

    public void setPoolAccess(PoolAccess poolAccess){
        this.poolAccess = poolAccess;
    }

    public void useGym(String memberType) throws Exception {
        gymAccess.useGym(memberType);
    }

    public void usePool(String memberType) throws Exception{
        poolAccess.usePool(memberType);
    }

    public void receptionMessage(){
        JOptionPane.showMessageDialog(null, "Welcome, how can we help?");
    }
}
