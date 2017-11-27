
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rosa Quiroga
 */
public enum Level {
    
    LEVEL_1 (new ArrayList<>(Arrays.asList(
            generateRadom(3,5),generateRadom(3,5),generateRadom(3,5),
            generateRadom(3,5),generateRadom(3,5),generateRadom(3,5),
            generateRadom(3,5),generateRadom(3,5),generateRadom(3,5)))),
    LEVEL_2 (new ArrayList<>(Arrays.asList(
            generateRadom(2,4),generateRadom(2,4),generateRadom(2,4),
            generateRadom(2,4),generateRadom(2,4),generateRadom(2,4),
            generateRadom(2,4),generateRadom(2,4),generateRadom(2,5)))),
    LEVEL_3 (new ArrayList<>(Arrays.asList(
            generateRadom(0,2),generateRadom(0,2),generateRadom(0,2),
            generateRadom(0,2),generateRadom(0,2),generateRadom(0,2),
            generateRadom(0,2),generateRadom(0,2),generateRadom(0,2)))),;
    
    private final List<Integer> listLevel;
    
    Level(List<Integer> listLevel) {    
        this.listLevel = listLevel;
    }
    
    List<Integer> getLevelList () {
        return listLevel;
    }
    
    private static int generateRadom (int low, int high) {
        Random r = new Random();
        return r.nextInt(high) + low;
    }
}
