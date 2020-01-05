package member;

public class Student extends MemberDecorator {
    Member member;

    @Override
    public void access() {
        System.out.println("Gym Access");
    }

    public Student(){
        status = "StudentMembership";
    }

    public Student(Member member){
        this.member = member;
    }

    public String getStatus(){
        return member.getStatus() + ", Student";
    }

    public double cost(){
        return member.cost() - (member.cost() * 0.2);
    }
}
