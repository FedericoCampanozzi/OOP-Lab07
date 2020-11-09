package it.unibo.oop.lab.enum1;

import org.junit.Test;

import it.unibo.oop.lab.socialnetwork.User;
import it.unibo.oop.lab.socialnetwork.*;

/**
 * This is going to act as a test for
 * {@link it.unibo.oop.lab.enum1.SportSocialNetworkUserImpl}
 * 
 * 1) Realize the same test as the previous exercise, this time using
 * enumeration Sport
 * 
 * 2) Run it: every test must return true.
 * 
 */
public final class TestSportByEnumeration {

    private TestSportByEnumeration() { }

    /**
     * @param args
     *            ignored
     */
    
    //public static void main(final String... args) {
        /*
         * [TEST DEFINITION]
         * 
         * By now, you know how to do it
         */
        // TODO
    //}
    
    @Test
    public void testSport() {
    	SportSocialNetworkUserImpl<User> mRossi = new SportSocialNetworkUserImpl<>("Mario","Rossi","mrossi");
    	SportSocialNetworkUserImpl<User> mNeri = new SportSocialNetworkUserImpl<>("Marco","Neri","mneri");
    	
    	mRossi.addSport(Sport.BASKET);
    	mRossi.addSport(Sport.F1);
    	mRossi.addSport(Sport.MOTOGP);
    	mRossi.addSport(Sport.BASKET);
    }
}
