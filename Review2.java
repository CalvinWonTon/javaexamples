/*
 _____ ____ ___   ____   ___  _  ___  
 | ____/ ___|_ _| |___ \ / _ \/ |( _ ) 
 |  _| \___ \| |    __) | | | | |/ _ \ 
 | |___ ___) | |   / __/| |_| | | (_) |
 |_____|____/___| |_____|\___/|_|\___/ 
 */

 //If you are lost, do not be afraid to ask for help or look back on previous assignments.

public class Review2 {
	public static void main(String[] args){


    //EXERCISE: Create a String array called birbs with 5 indexes. In the first index put "cockatiels"
    
 	  String[] birds;
      birds = new String[5];
      birds[0] = "cockatiels";
      birds[1] = "parrot";
      birds[2] = "emu";
      birds[3] = "owl";
      birds[4] = "hummingbird";
      // birds[5] = "robin";
  
 	for (int i = 0; i < birds.length; i++) {
         System.out.println("The bird at the " + i + " index is the "+ birds[i]);          
    }

	}
}
