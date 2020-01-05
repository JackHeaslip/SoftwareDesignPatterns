package member;

public abstract class CreateMemberCard {
    final void createCard(){
        heatInk();
        applyImage();
        applyMemberInfo();
    }

    abstract void applyImage();

    void heatInk(){
        System.out.println("Heating Printer Ink");
    }

    void applyMemberInfo(){
        System.out.println("Printing Member Information");
    }
}
