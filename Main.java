package com.company;

import java.util.*;

public class Main {
    enum Week {MON,TUES, WED, THURS,FRI,SAT,SUN};

    public static void main(String[] args) {
	// write your code here
        ArrayList<String> array = new ArrayList<>();
        array.add("One");
        array.add("Two");

        array.get(1);// accessing element at index 2
        array.set(0,"One_changed");// changing the value of the element at position 1

        for(int i = 0; i < array.size(); i++){
            System.out.println(array.get(i));
        }

        for(String i : array) {
            System.out.println(i);
        }

        System.out.println(array.get(0));



//        An array of integers
            ArrayList<Integer> arrayList = new ArrayList<Integer>();
            arrayList.add(1);
            arrayList.add(2);
            arrayList.add(3);
            arrayList.set(1, 5);

            arrayList.sort(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o1.compareTo(o2);
                }
            });
        System.out.println(arrayList);


//        Enums
        Week day = Week.SAT;
        for(Week week : Week.values()){
            System.out.println(week);
        }
//            LinkedLists
        LinkedList<String> text = new LinkedList<String>();
        text.add("Hi");
        text.add("Hiii");
        text.add("Hello");
        text.add("Heeee");

        text.addFirst("Gina");//Inserting at the first index
        text.addLast("Adzz"); //Inserting at the end

        System.out.println(text);


//        HashMapS: It stores items in key/value pairs
        HashMap<String, String> capitalCities =  new HashMap<String, String>();
        capitalCities.put("Ghana","Accra");// adding items to the hashmap
        capitalCities.put("Nigeria","Lagos");
        capitalCities.put("Togo","Lome");

        capitalCities.get("Ghana"); //accessing the value of an item or key


//        capitalCities.remove("Togo");//removing item from map

//        capitalCities.clear();//removing all items in the map

//        looping through a hashmap to print the keys in the map
        for(String i : capitalCities.keySet()){
            System.out.println(i);
        }

        //looping through to get the values in the map
        for (String i : capitalCities.values()){
            System.out.println(i);
        }

        for (String i : capitalCities.keySet()){
            //printing all keys and values
            System.out.println("Key: " + i + " value:"+ capitalCities.get(i));
        }
//         HashMap example 2
        HashMap<String, Integer> People = new HashMap<String, Integer>();

        People.put("Gyee",10);
        People.put("Gyna",110);
        People.put("GG",1110);

        for (String i : People.keySet()){
            System.out.println("Key: "+i + " value: "+ People.get(i));
        }


        //HashSet: A collection of items where all items are unique
        HashSet<String> cars = new HashSet<String>();

        cars.add("Benz");
        cars.add("BMW");
        cars.add("Camry");
        System.out.println(cars);

//        checking if items exist
        System.out.println( cars.contains("BMW"));

//            Example 2
//        Wrapper classes: char --> Character, int --> Integer
//            Primitive types are not objects so you use wrapper classes in order to access them
        HashSet<Integer> numbers = new HashSet<Integer>();
        numbers.add(4);
        numbers.add(2);
        numbers.add(3);

        System.out.println(numbers);

        for(int i=0; i <= 10; i++){
            if(numbers.contains(i)){
                System.out.println(i + "was found in the set");
            }else {
                System.out.println(i + " was not found in the set");
            }
        }

        Iterator<String> ip = cars.iterator();

        System.out.println(ip.next());//printing the first element in the set: the hasNext method returns true if next would return a value not an exception

    }

}
