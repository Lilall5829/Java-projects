/* A2LiL.java
 * 
 * This program is to solve the following problem:
   Assume there are 100 lockers numbered 1 to 100 with 100 students lined up in front of those 100 lockers:
	•	The first student opens every locker.
	•	The second student closes every 2nd locker.
	•	The 3rd student changes every 3rd locker; if it’s closed, the student opens it; if it’s open, the student closes it.
	•	The 4th student changes every fourth locker.
	•	The 5th student changes every 5th locker.
	•	That same pattern continues for all 100 students.
	The problem is what’s the status(open/close) of each locker (from number 1 to 100).
 * 
 * Revision History:
 *     La Li 2023.06.10: Created
 */

public class A2LiL {
	/*
	 * @param i Integer  The parameter for counting the number of students.
	 * @param j Integer  The parameter for counting the number of students.
	 * @param result String  The parameter for storing the state of current locker: open or close.
	 * @param lockers Boolean Array  The parameter for storing the state of each locker.  
     */
	public static void main(String[] args) {
		// The parameters are declared here.
		int i, j;
		String result;
		boolean[] lockers = new boolean[100]; 
		// For boolean variable, its default value is false, so there is no need to change it here.
		// Using a double loop: the outer loop controls the student number, and the inner one controls the locker number.
		for (i = 1; i <= 100; i++) {
			for (j = i; j <= 100; j += i) {
				// Switching the state of current locker.
				lockers[j - 1] = !lockers[j - 1];
			}
			// Displaying the state of the first locker that the current student has operated. 
			// This part can also be placed outside the double loop and use a loop to display the state of each locker. I'm just doing this to make the code simpler.
			result = lockers[i - 1] ? "open" : "close";
			System.out.println("Locker " + i + " is " + result);
		}
	}
}
