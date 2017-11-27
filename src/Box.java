/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rosa quiroga
 */
public class Box {
    
    private int index = 0;
    private int value = 0;
    
    public Box (int index) {
        this.index = index;
    }
    
    public Box (int index, int value) {
        this.index = index;
        this.value = value;
    }
    
    public void setIndex (int index) {
        this.index = index;
    }
    
    public void setValue (int value) {
        this.value = value;
    }

    String show() {
        String auxVal = (value == 0)? "_" : value + "";
        return "(" + index + ", " + auxVal + ")";
    }

    int getIndex() {
        return index;
    }
    
}
