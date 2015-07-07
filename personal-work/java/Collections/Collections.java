/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;
import java.util.*; // it uses items from here so i just included them all
/**
 *
 * @author Chad
 * 
 * followed along from http://www.tutorialspoint.com/javaexamples/collection_all.htm
 */
public class Collections {
   public static void main(String[] args) {
      List list = new LinkedList();
      list.add("passedelement1");
      list.add("passedelement2");
      list.add("passedelement3");
      list.add("passedelement4");
      displayAll(list);// passes it to be displayed
      
      List array = new ArrayList();
      array.add("a");
      array.add("b");
      array.add("c");
      displayAll(array);// passes it to be displayed
      
      Set hashSet = new HashSet();
      hashSet.add("ChadHill");
      hashSet.add("CandiceHill");
      hashSet.add("NebuchadnezzarHill");
      displayAll(hashSet);// passes it to be displayed
      
      SortedSet treeSet = new TreeSet();
      treeSet.add("a");
      treeSet.add("b");
      treeSet.add("c");
      treeSet.add("d");
      displayAll(treeSet);// passes it to be displayed
      
      LinkedHashSet lnkHashset = new LinkedHashSet();
      lnkHashset.add("uno");
      lnkHashset.add("dos");
      lnkHashset.add("tres");
      lnkHashset.add("quatro");
      displayAll(lnkHashset);// passes it to be displayed
      

   }
   static void displayAll(Collection col) {
      Iterator itr = col.iterator(); // this is just the counter 
      while (itr.hasNext()) {
         String str = (String) itr.next(); // keeps printing it out until it no longer can
         System.out.print(str + " "); // adds spaces inbetween the outputs
      }
System.out.println(); // adds an enter so that it doesnt look all jumbled
   }
}
