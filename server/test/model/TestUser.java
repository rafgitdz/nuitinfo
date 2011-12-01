/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import org.junit.Test;
import junit.framework.TestCase;
/**
 *
 * @author mavomoeb
 */
public class TestUser extends TestCase {

    @Test
    public void testCreateUser() {
        User user1 = new User("peter", "stalin", "bla@bma.com", "lol", "azerty");
        assertEquals("peter",user1.getName());
    }

    
    
}



