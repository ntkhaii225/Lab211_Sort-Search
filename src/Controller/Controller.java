/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Elements;
import View.Menu;
import javax.lang.model.element.Element;

/**
 *
 * @author ntkhai
 */
public class Controller extends Menu{
    Array_Processing a = new Array_Processing();
    Elements e = new Elements();
    public Controller() {
        super("Table Of The Contents", new String[] {
            "Input", "Output", "Sort", "Find", "Exit"
        });
    } 
    @Override
    public void execute(int choice) {
        switch(choice) {
            case 1:
                int arr[] = a.inputArr();
                e.setArr(arr);
                break;
            case 2:
                a.showArr("",e.getArr());
                break;
            case 3:
                new Sort().run();
                break;
            case 4:
                new Search().run();
                break;
        }
    }
    
}
