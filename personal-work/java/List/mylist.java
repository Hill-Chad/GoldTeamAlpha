package javaapplication5;
//  reference : https://www.youtube.com/watch?v=vTgNIh3-aEI
//  https://github.com/itcuties/Java-List-Files
//  
import java.util.*;
public class mylist {
    public static void main(String[] args) {
    ArrayList<String> mylist = new ArrayList<String>();
		mylist.add("Party Hard");
		mylist.add("Rock out");
		mylist.add("124356&^%**^^&%");
                mylist.add("What insert will break this?");
                // mylist.add("What insert" will "break this?"); // you cant have double quotes it breaks it
                mylist.add("What insert will break this/.?"); // /. is not a reserved character
                  mylist.add("What insert will break /*this?"); // this one wont break because its in quotes
               // mylist.add("What insert will break this?.......................); // you need to have an ending quote
		for(String eachItemInList : mylist){
			System.out.println(eachItemInList);
		}
          /*  for ( int i = 0; i < myToDoList.size(); ++i){ // the wrong < symbol is used it needs to be the other way
			System.out.println(myToDoList.get(i));
		}
		/*
                Iterator<String> myIter = mylist.iterator();
		while (myIter.hasNext()){
			System.out.println(myIte.next()); // ite is not the proper variable, Iter is
		}
                
                */
                // this is the required iterator to print out the list
                Iterator<String> myIter = mylist.iterator();
		while (myIter.hasNext()){
			System.out.println(myIter.next()); // ite is now fixed to iter
		}
                        }
}

