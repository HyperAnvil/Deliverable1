/*
 * Harneet Singh
 * Student ID: 991548426
 * SYST10199 - Web Programming
 */

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author harmeetsingh
 */
public class GameTest {
    
    public GameTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testAddPlayer() {
        System.out.println("addPlayer");
        Player player = new Player("testPlayer");
        Game instance = new Game("uno");
        boolean expResult = true;
        boolean result = instance.addPlayer(player);
        assertEquals(expResult, result);
       
    }

   
    

   

   

    
}