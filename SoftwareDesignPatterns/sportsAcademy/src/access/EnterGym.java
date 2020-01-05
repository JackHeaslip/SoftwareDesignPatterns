package access;
import javax.swing.*;

public class EnterGym implements GymAccess{
    @Override
    public void useGym(String memberType) throws Exception {
        if (memberType.equals("Pool")) {
            throw new Exception("This customer cannot enter the gym");
        }
        JOptionPane.showMessageDialog(null, "Access granted, enter gym");
    }
}

