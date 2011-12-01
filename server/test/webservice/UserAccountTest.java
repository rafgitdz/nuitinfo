/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package webservice;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jbaleiza
 */
public class UserAccountTest {

    public UserAccountTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of CreateAccount method, of class UserAccount.
     */
    @Test
    public void testCreateAccount() throws Exception {
        System.out.println("CreateAccount");
        String id = "";
        String nom = "";
        String prenom = "";
        String mdp = "";
        String mail = "";
        String date_naissance = "";
        UserAccount instance = (UserAccount)javax.ejb.embeddable.EJBContainer.createEJBContainer().getContext().lookup("java:global/classes/UserAccount");
        Integer expResult = 1;
        Integer result = instance.CreateAccount(id, nom, prenom, mdp, mail, date_naissance);
        assertEquals(expResult, result);
        
    }

}