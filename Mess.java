/*
 * The Java programming language has static typing. 
 * Java programs will not compile if a variable is assigned a value of an incorrect type. 
 * This is a bug, specifically a type declaration bug.
 */
public class Mess {
	public static void main(String[] args) {   
		String year = 2001;
    double title = "Shrek";
    int genre = 'C';
    boolean runtime = 1.58;
    char isPG = true;
	}
}

/*
  Mess.java:3: error: incompatible types: int cannot be converted to String
    String year = 2001;
                  ^
  Mess.java:4: error: incompatible types: String cannot be converted to double
    double title = "Shrek";
                   ^
  Mess.java:6: error: incompatible types: double cannot be converted to boolean
    boolean runtime = 1.58;
                      ^
  Mess.java:7: error: incompatible types: boolean cannot be converted to char
    char isPG = true;
                ^
  4 errors
*/

/* CORRECT VERSION
public class Mess {
	public static void main(String[] args) {   
		int year = 2001;
    String title = "Shrek";
    char genre = 'C';
    double runtime = 1.58;
    boolean isPG = true;
	}
}
 */