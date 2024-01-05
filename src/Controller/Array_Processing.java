/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Elements;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ntkhai
 */
public class Array_Processing {
    Scanner sc = new Scanner(System.in);    
    Elements element = new Elements();
    Random random = new Random();
    public int realDecimalNumber(String str)
    {
        int number = 0;
        while(true)
        {
            System.out.println(str);
            number = sc.nextInt();
            if(number >= 0)
            break;
        }
        return number;
    }
    
    public int[] generateRandomArray()
    {
        element.setSize(realDecimalNumber("Enter number of array:"));
        int[] a = new int[element.getSize()];
        for(int i = 0; i < element.getSize(); i++)
        {
            a[i] = random.nextInt(element.getSize());
        }
        return a;
    }
    
    public int[] inputArr()
    {
        element.setSize(realDecimalNumber("Enter number of array:"));
        int a[] = new int[element.getSize()];
        element.setArr(a);
        for(int i = 0; i < element.getSize();i++)
        {
            System.out.println("Enter number of element's " + i);
            a[i] = sc.nextInt();
        }
        return a;
    }
    
    public void showArr(String str, int a[]){
    {
        System.out.print(str + " array:[");
       for(int i = 0; i < a.length; i++)
       {
           if(i == a.length - 1)
               System.out.print(a[i]);
           else
           System.out.print(a[i] + ", ");
       }
        System.out.print("]");
    }
    
//    public int partition(int low, int high) {
//        int[] arr = element.getArr();
//        int pivot = arr[high];
//        int i = low - 1;
//
//        for (int j = low; j < high; j++) {
//            if (arr[j] <= pivot) {
//                i++;
//                swap(i, j);
//            }
//        }
//        swap(i + 1, high);
//        return i + 1;
//    }
//
//    private void swap(int i, int j) {
//        int[] arr = element.getArr();
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
}}
