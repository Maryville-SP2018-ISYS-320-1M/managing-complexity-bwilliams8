/*
  	ISYS 320
  	Name(s):Brian Williams
  	Date: 3/25/2018
*/



/* 2. Create a table below (just using text) that outlines your analysis of the figure. That is, how many
 * of each character on each line? What expression captures the relationship between the line number and
 * how many of the character is printed on each line? Choose your headings based on how you can break down
 * the figure.
  
Line Number		| Amount of !		| Amount of \		| Ratio of ! to \		| Ratio of \ to !		|
1				| 22				| 0					| 100%					| 0%
2				| 18				| 4					| 82%					| 18%
3				| 14				| 8					| 64%					| 36%
4				| 10				| 12				| 46%					| 54%
5				| 6					| 16				| 27%					| 72%
6				| 2					| 20				| 9%					| 91%





*/

/* 3. Using your analysis from above, in pseudocode describe the algorithm for how to draw the figure
 
 I'm not great at pseudocode, but essentially a for-loop that runs slashes first, exclamations second, then slashes again, with slashes starting at 0 and incrementing by 2, while exclamations reduce by 4 per iteration.
 
 
 
 */

public class P2_SlashesAndBangs {

	public static void main(String[] args) {
		for (int row = 6; row >= 1; row--) {
			for (int slash = 1; slash <= row * -2 + 6 * 2; slash++) {
				System.out.print( "\\" );
			}
			for(int exclamation = 1; exclamation <= row * 4 - 2; exclamation++) {
				System.out.print("!");
			}
			for (int slash = 1; slash <= row * -2 + 6 * 2; slash++) {
				System.out.print("\\");
			}
			System.out.println("");
			
		}

	}

}
