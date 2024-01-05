/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Elements;
import View.Menu;
import View.MiniMenu;
import java.util.Random;
import java.util.Scanner;
import javax.lang.model.element.Element;

/**
 *
 * @author ntkhai
 */
public class Sort extends MiniMenu{
   Array_Processing arr = new Array_Processing();
    int a[] = Elements.getArr();
   public Sort() {
        super("Select Type Of Sort", new String[] {
            "Bubble Sort", "Quick Sort", "Exit"
        });
    } 
    
   public void BubbleSort(int a[])
   {
       int size = a.length;
       for(int i = 0; i < size; i++)
       {
           for(int j = 0; j < size - i - 1; j++)
           {
               if(a[j] > a[j+1])
               {
                    int temp = a[j]; 
                    a[j] = a[j+1]; 
                    a[j+1] = temp;
               }
           }
       }
   }

   public void doBubbleSort(int a[])
   {
       arr.showArr("Unsorted",a);
       System.out.println("");
       BubbleSort(a);
       arr.showArr("Sorted",a);
   }
   
   
   public void quickSort(int low, int high, int a[]) {
        if (low < high) {
            int partitionIndex = partition(low, high, a);
            quickSort(low, partitionIndex - 1, a);
            quickSort(partitionIndex + 1, high, a);
        }
        
    }

   public int partition(int low, int high, int arr[]) {
       
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(i, j,arr);
            }
        }
        swap(i + 1, high,arr);
        return i + 1;
    }

    public void swap(int i, int j, int arr[]) {
//        int[] arr = element.getArr();
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
   
    public void doQuickSort(int a[])
   {
       int size = a.length;
       arr.showArr("Unsorted",a);
       System.out.println("");
       
       quickSort(0, size - 1,a);
       arr.showArr("Sorted",a);
   }
    
    @Override
    public void execute(int choice) {
        switch(choice) {
            case 1:
                doBubbleSort(a);
                break;
            case 2:
                doQuickSort(a);
                break;
            case 3:
                new Controller().run();
                break;
        }
    }
    
    
}
