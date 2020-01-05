package access;
import javax.swing.*;

public class EnterPool implements PoolAccess{
    @Override
    public void usePool(String memberType) throws Exception{
        if (memberType.equals("Gym")) {
            throw new Exception("This customer cannot enter the pool");
        }
        JOptionPane.showMessageDialog(null, "Access granted, enter pool");
    }
}
