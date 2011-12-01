/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package webservice;

import java.util.List;
import model.Category;
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
public class UserWishesTest {

    public UserWishesTest() {
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
     * Test of AddWish method, of class UserWishes.
     */
    @Test
    public void testAddWish() throws Exception {
        System.out.println("AddWish");
        Integer id = 1;
        String nickname = "";
        String name = "";
        String description = "";
        List<Category> categories = null;
        UserWishes instance = new UserWishes();
        Integer expResult = 1;
        Integer result = instance.AddWish(nickname, id, name, description, categories);
        assertEquals(expResult, result);
    }

    /**
     * Test of DelWish method, of class UserWishes.
     */
    @Test
    public void testDelWish() throws Exception {
        System.out.println("DelWish");
        String nickname = "";
        Integer id = null;
        String name = "";
        String description = "";
        List<Category> categories = null;
        UserWishes instance = new UserWishes();
        Integer expResult = 1;
        Integer result = instance.DelWish(nickname, id, name, description, categories);
        assertEquals(expResult, result);
    }

    /**
     * Test of SetWish method, of class UserWishes.
     */
    @Test
    public void testSetWish() throws Exception {
        System.out.println("SetWish");
        String nickname = "";
        Integer id = null;
        String name = "";
        String description = "";
        List<Category> categories = null;
        UserWishes instance = new UserWishes();
        Integer expResult = 1;
        Integer result = instance.SetWish(nickname, id, name, description, categories);
        assertEquals(expResult, result);
    }

}