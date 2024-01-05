/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ntkhai
 */
public class Elements {
    private int size;
    private static int[] arr;

    public Elements() {
        
    }
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    
    public static int[] getArr() {
        return arr;
    }

    public static void setArr(int[] arr) {
        Elements.arr = arr;
    }
}
