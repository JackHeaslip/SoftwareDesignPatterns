package member;

public class MemberFactory {

    //use getMember method to get object of type member
    public Member getMember(String memberType){
        if(memberType == null){
            return null;
        }
        if(memberType.equalsIgnoreCase("Gym Access")){
            return new GymMembership();

        } else if(memberType.equalsIgnoreCase("Pool Access")){
            return new PoolMembership();

        } else if(memberType.equalsIgnoreCase("Full Access")){
            return new FullMembership();
        }

        return null;
    }
}
