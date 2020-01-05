package member;

public class MemberFactorySample {

    public static void main(String[] args) {
        MemberFactory memberFactory = new MemberFactory();

        //get an object of GymMembership and call its access method.
        Member member1 = memberFactory.getMember("Gym Access");

        member1.access();

        //get an object of PoolMembership and call its access method.
        Member member2 = memberFactory.getMember("Pool Access");

        member2.access();

        //get an object of FullMembership and call its access method.
        Member member3 = memberFactory.getMember("Full Access");

        member3.access();
    }
}
