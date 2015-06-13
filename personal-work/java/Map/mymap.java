import java.util.*;
/* hashmap keys and values are very simalr to an array, but they are linked to gether only singualrly*/
public class mymap {
    static HashMap<String, String> map = new HashMap<>();
    public static void main(String[] args){
    	// Allow to store certain variables with a value
    	map.put("Kenny", "Starts with a K");
    	map.put("Joe", "Starts with a J");
    	map.put("Java", "Starts with a J for Java");
    	map.put("Java", "Starts with a J for Java, and not Joe"); // ! if there is a duplicate key the value is override
    	
    	//map.remove("Java"); // this will remove the java from the total list
    	//get the key
    	System.out.println(map.get("Kenny")); //Prints out the second value from the key
    	System.out.println(map.get("Joe"));
    	// you are going to be use hashmap from when you program, ie you will use one key to link it to a specific value.
    	
    	// you can check if the hashmap contains a key "KEYname"
    	if(map.containsKey("Java")) System.out.println(map.get("Java"));
    	
    	// you can check if the hashmap contains a value 
    	if(map.containsValue("Starts with a J")) System.out.println("This Value contains 'Starts with a J'");
    	
    	
    	// Print out the hashmap keys
    		System.out.println(map.keySet());

    
}
}
