/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rosa quiroga
 */
public class BoardTest {
    
    @Test
    public void basicCaseTest() {
        Board board = new Board();
        int size = board.size();
        assertEquals(9, size);
    }
    
    @Test
    public void showCubes () {
        Board board = new Board();
        String currentValue = board.show();
        assertEquals("" , currentValue);
    }
    
}
