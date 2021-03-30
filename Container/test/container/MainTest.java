/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package container;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author dany
 */
public class MainTest extends TestCase {
    
//    public MainTest(String testName) {
//        super(testName);
//    }

    /**
     * Test of main method, of class Main.
     */
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        Main.main(args);
//      
//    }
     public static Test suite() {
        TestSuite suite = new TestSuite(ContainerTest.class);
        return suite;
    }
    
}
