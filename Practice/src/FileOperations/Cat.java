package FileOperations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Cat { 

    public static void main(String[] args) { 

    	
    	String file = "/Users/spadwal/Desktop/FlowDimSpec.json";
    	String file1 = "/Users/spadwal/Desktop/FlowDimSpecWrite.json";
    	
    	try{
    		 FileReader fileReader = 
    	                new FileReader(file);
    		 FileWriter fileWriter = 
 	                new FileWriter(file1);
    		 
    		 String line = null;
    		 BufferedReader br = new BufferedReader(fileReader);
    		 BufferedWriter br1 = new BufferedWriter(fileWriter);
    		 while((line = br.readLine()) != null ){
    			 System.out.println(line);
    			 br1.write(line);
    		 }
    		 br.close();
    		 br1.close();
    	}catch(FileNotFoundException e){
    		System.out.println("Unable to find file!!");
    	}catch(IOException e){
    		System.out.println("Unable to input/output file!!");
    	}
    }
    	

}
