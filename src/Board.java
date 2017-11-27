
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rosa quiroga
 */
class Board {
    
    private List<Cube> cubes;
    
    Board(){
        cubes = new ArrayList<>();
        addCubes(Level.LEVEL_1);
    }

    void addCubes(Level level) {
        List<Integer> list = level.getLevelList();
        int i = 1;
        for (int fillIndex : list) {
            cubes.add(new Cube(i, fillIndex));
            i++;
        }
    }
    
    public String show() {
        String stringCubes = "";
        for (Cube cube : cubes) {
            stringCubes += cube.show() + "\n";
        }
        return stringCubes;
    }

    int size() {
        return cubes.size();
    }
}
