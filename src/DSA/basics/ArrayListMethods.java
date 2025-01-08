package DSA.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/*

add()	Add an item to the list	boolean|void
addAll()	Add a collection of items to the list	boolean
clear()	Remove all items from the list	void
clone()	Create a copy of the ArrayList	Object
contains()	Checks whether an item exist in the list	boolean
ensureCapacity()	Increase the capacity of the list to be able to fit a specified number of items	void
forEach()	Perform an action on every item in the list	void
get()	Return the item at a specific position in the list	T
indexOf()	Return the position of the first occurrence of an item in the list	int
isEmpty()	Checks whether the list is empty	boolean
iterator()	Return an Iterator object for the ArrayList	Iterator
lastIndexOf()	Return the position of the last occurrence of an item in the list	int
listIterator()	Return a ListIterator object for the ArrayList	ListIterator
remove()	Remove an item from the list	boolean|T
removeAll()	Remove a collection of items from the list	boolean
removeIf()	Remove all items from the list which meet a specified condition	boolean
replaceAll()	Replace each item in the list with the result of an operation on that item	void
retainAll()	Remove all elements from the list which do not belong to a specified collection	boolean
set()	Replace an item at a specified position in the list	T
size()	Return the number of items in the list	int
sort()	Sort the list	void
spliterator()	Return a Spliterator object for the ArrayList	Spliterator
subList()	Return a sublist which provides access to a range of this list's items	List
toArray()	Return an array containing the list's items	Object[]
trimToSize()	Reduce the capacity of the list to match the number of items if necessary	Object[]

 */

public class ArrayListMethods {
    public static void main(String[] args) {

        ArrayList<String> empty = new ArrayList<>();

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

//        System.out.println(cars);

        ArrayList<String> brands = new ArrayList<String>();
        brands.add("Microsoft");
        brands.add("Samsung");
        brands.add("Apple");

        brands.addAll(cars);

//        System.out.println(brands);

        ArrayList cars2 = (ArrayList)cars.clone();
        cars2.set(0, "Toyota");

//        System.out.println(cars);
//        System.out.println(cars2);

//        System.out.println(cars.contains("BMW"));
//        System.out.println(cars.contains("bmw"));

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.ensureCapacity(15);
        for (int i = 1; i <= 15; i++) {
            list.add(i);
        }

//        System.out.println(list);

//        cars.forEach((car) -> {
//            System.out.println(car);
//        });

//        System.out.println(cars.get(3));
//        System.out.println(cars.indexOf("BMW"));
//        System.out.println(empty.isEmpty());

        Iterator<String> it = cars.iterator();

//        while(it.hasNext()) {
//            System.out.println(it.next());
//        }

//        cars.add("Ford");
//        System.out.println(cars.indexOf("Ford"));
//        System.out.println(cars.lastIndexOf("Ford"));

//        cars.remove("BMW");
//        System.out.println(cars);

//        cars.removeAll(cars);
//        System.out.println(cars);

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(6);
        numbers.add(1);
        numbers.removeIf( n -> n % 2 == 0 );
//        System.out.println(numbers);

        ArrayList<String> valid = new ArrayList<String>();
        valid.add("Volvo");
        valid.add("Ford");
        valid.add("Mazda");

//        cars.retainAll(valid);
//        System.out.println(cars);

//        cars.set(0,"Opel");
//        System.out.println(cars);

//        System.out.println(cars.size());

//        cars.sort(null);
//        System.out.println(cars);

//        System.out.println( cars.subList(1, 3));

        Object[] carsArray = cars.toArray();

//        for(Object item : carsArray) {
//            System.out.println(item);
//        }

    }

}
