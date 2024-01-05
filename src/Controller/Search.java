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
public class Search extends Menu {
    Array_Processing array = new Array_Processing();
    int a[] = Elements.getArr();
    public Search() {
        super("Select Type Of Search", new String[] {
            "Linear Search", "Binary Search", "Back", "Exit"
        });
    } 
    public int linearSearch(int arr[], int x) 
{ 
    int n = arr.length; 
    for(int i = 0; i < n; i++) 
    { 
        if(arr[i] == x) 
            return i; 
    } 
    return -1; 
}
    public void dolinearSearch(int a[])
    {
        int n = array.realDecimalNumber("Input the number you want to find: ");
        int check = linearSearch(a, n);
        if(check == -1) 
        System.out.print("Element is not present in array"); 
        else
        System.out.print("Element is present at index " + check);
    }
    
    public int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    
    public void doBinarySearch(int arr[])
    {
        for(int i = 0; i < arr.length - 1; i++)
        {
            if(arr[i] > arr[i+1])
            {
            System.out.println("Please sort after use this!");
            return;
            }
        }
        
        int n = array.realDecimalNumber("Input the number you want to find: ");
        int check = binarySearch(arr, n);
        if(check == -1) 
        System.out.print("Element is not present in array"); 
        else
        System.out.print("Element is present at index " + check);
        
    }
    
    @Override
    public void execute(int choice) {
        switch(choice) {
            case 1:
                dolinearSearch(a);
                break;
            case 2:
                doBinarySearch(a);
                break;
            case 3:
                new Controller().run();
                break;
        }
    }
    
}
