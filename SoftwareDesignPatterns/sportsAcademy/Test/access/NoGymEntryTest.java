package access;

import member.GymMembership;
import member.Member;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NoGymEntryTest {
    Member mem;

    @BeforeEach
    void before() {
        Member mem = new GymMembership();
        mem.setGymAccess(new EnterGym());
    }

    @Test
    void useGym() throws Exception {
        assertThrows(Exception.class,()-> mem.useGym("Pool"));
    }
}