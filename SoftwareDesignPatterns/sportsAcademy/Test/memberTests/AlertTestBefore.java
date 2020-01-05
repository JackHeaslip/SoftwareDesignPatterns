//package memberTests;
//
//import member.*;
//
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class AlertTestBefore {
//    Member member1 = new FullMembership();
//    @Test
//    void testReceptionMessageFullMember() { assertEquals("Full members can go everywhere", member1.receptionMessage()); }
//    @Test
//    void testPoolAccessFullMember(){ assertEquals("Pass Accepted, enter pool", member1.usePool("Full")); }
//    @Test
//    void testGymAccessFullMember(){ assertEquals("Pass Accepted, enter gym", member1.useGym("Full")); }
//
//
//    Member member2 = new GymMembership();
//    @Test
//    void testReceptionMessageGymMember() { assertEquals("This member can use the gym", member2.receptionMessage()); }
//    @Test
//    void testPoolAccessGymMember(){ assertEquals("Pass Declined, your membership does not include pool access", member2.usePool("Gym")); }
//    @Test
//    void testGymAccessGymMember(){ assertEquals("Pass Accepted, enter gym", member2.useGym("Gym")); }
//
//
//    Member member3 = new PoolMembership();
//    @Test
//    void testReceptionMessagePoolMember() { assertEquals("This member can use the pool", member3.receptionMessage()); }
//    @Test
//    void testPoolAccessPoolMember(){ assertEquals("Pass Accepted, enter pool", member3.usePool("Pool")); }
//    @Test
//    void testGymAccessPoolMember(){ assertEquals("Pass Declined, your membership does not include gym access", member3.useGym("Pool")); }
//}
