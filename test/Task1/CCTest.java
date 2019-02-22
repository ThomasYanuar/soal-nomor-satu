package Task1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Task001.Operation;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author FES
 */
public class CCTest {
    Operation o = new Operation();
    public CCTest() {
        
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void faktorialTest() 
     {
         double exp = 120;
         double act = o.faktorial(5);
         assertEquals(exp, act, 0);
     }
//     @Test
//     public void faktorialTest2() 
//     {
//         double exp = 120;
//         double act = o.faktorial(5);
//         assertEquals(exp, act,0);
//     }
}
