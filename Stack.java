package com.company;

import java.util.ArrayList;
import java.util.List;

public class Stack <T>{
   private List<T>  values ;
   private int counter;


    public Stack(){
        values = new ArrayList<T>();
        counter=0;
    }

    //putting elements on the stack
     void Push(T item){
        this.values.add(item);
        counter++;
     }

     T Top(){
        if(counter < 0){
            return  null;
        }
         return this.values.get(counter - 1);
     }

     void Pop(){
        if(counter <= 0){
            System.out.println("Nothing on the stack");
            return;
        }

         System.out.println("The top is " + this.values.get(counter - 1));
         this.values.remove(counter -1);
         counter--;
//         Top();
     }

     int size(){
        return values.size();
     }
}
