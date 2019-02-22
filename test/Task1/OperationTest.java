/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task1;

import Task001.Operation;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author FES
 */
public class OperationTest {

    Operation o = new Operation();

    public OperationTest() {
    }

    @Test
    public void faktorialTest() {
        double exp[] = {120,0,1};
        double act[] = {o.faktorial(5),o.faktorial(-1),o.faktorial(0)};
        for (int i = 0; i < exp.length; i++)assertEquals(exp[i], act[i], 0);
    }
    
    @Test
    public void permutasiTest() {
        double exp[] = {24,0,0};
        double act[] = {o.permutasi(4,3),o.permutasi(2,3),o.permutasi(-4,3)};
        for (int i = 0; i < exp.length; i++)assertEquals(exp[i], act[i], 0);
    }

    @Test
    public void kombinasiTest() {
        double exp[] = {4,0,0};
        double act[] = {o.kombinasi(4,3),o.kombinasi(2,3),o.kombinasi(-4,3)};
        for (int i = 0; i < exp.length; i++)
            assertEquals(exp[i], act[i], 0);
    }

    @Test
    public void perkalianTest() {
        double exp[] = {10,-10,-10,10};
        double act[] = {o.perkalian(5,2),o.perkalian(-2,5),o.perkalian(5,-2),o.perkalian(-5,-2)};
        for (int i = 0; i < exp.length; i++)assertEquals(exp[i], act[i], 0);
    }
    
    @Test
    public void pemangkatanTest() {
        double exp[] = {1,0,0.04};
        double act[] = {o.pemangkatan(2,0),o.pemangkatan(0,1),o.pemangkatan(5,-2)};
        for (int i = 0; i < exp.length; i++)assertEquals(exp[i], act[i], 0);
    }

}
