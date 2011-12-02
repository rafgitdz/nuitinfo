/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import model.user.User;

import org.junit.Test;
/**
 *
 * @author mavomoeb
 */
public class TestUser {

    @Test
    public void testCreateUser() {
        User user1 = new User("peter", "stalin", "bla@bma.com", "lol", "azerty");
        assertEquals("peter",user1.getLastname());
    }

    
    
}



