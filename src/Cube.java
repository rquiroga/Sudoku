
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rosa quiroga
 */
public class Cube {
    int index = 0;
    List<Box> boxes;
    
    public Cube (int index, int fillNValues) {
        this.index = index;
        boxes = new ArrayList<>();
        boxes.add(new Box(1));
        boxes.add(new Box(2));
        boxes.add(new Box(3));
        boxes.add(new Box(4));
        boxes.add(new Box(5));
        boxes.add(new Box(6));
        boxes.add(new Box(7));
        boxes.add(new Box(8));
        boxes.add(new Box(9));
        
        fillValues(fillNValues);
    }
    
    private void fillValues (int fillNValues) {
        List<Integer> indexes = new ArrayList<>();
        List<Integer> values = new ArrayList<>();
        int i = 1;
        while (i <= fillNValues) {
            int boxIndex = generateRandom();
            if (!indexes.contains(boxIndex)) {
                indexes.add(boxIndex);
                updateValue(boxIndex, generateValue(values));
                i++;
            }
        }
    }
    
    private int generateValue(List<Integer> values) {
        int value = generateRandom();
        while (values.contains(value)) {
            value = generateRandom();
        }
        values.add(value);
        return value;
    }
    
    public String show () {
        String boxesList = "Cube " + index + " - ";
        boxesList = boxes.stream().map((box) -> box.show() + "").reduce(boxesList, String::concat);
        return boxesList;
    }
    
    private int generateRandom () {
        Random rand = new Random();
        return rand.nextInt(9) + 1;
    }

    private void updateValue(int boxIndex, int value) {
        (getBox(boxIndex)).setValue(value);
    }
    
    private Box getBox(int boxIndex) {
        for (Box box : boxes) {
            if (box.getIndex() == boxIndex) {
                return box;
            }
        }
        return null;
    }
    
}
