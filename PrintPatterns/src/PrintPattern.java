import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * java_dec20
 * 12/07/20
 * 
 * Day 1 Assignment 1
 * 	Print 4 Patterns displayed on slide 18 JavaBasics_Wk1_Day1.pptx
 * 
 */

/**
 * @author Ron Henson
 *
 */
public class PrintPattern {
	
	public static void main(String[] args) {
		List<String> Patterns = Collections.unmodifiableList(Arrays.asList(
				"1)",
				"*",
				"**",
				"***",
				"****",
				".........",
				"2)",
				"..........",
				"****",
				"***",
				"**",
				"*",
				"3)",
				"     *",
				"    ***",
				"   *****",
				"  *******",
				"...........",
				"4)",
				"............",
				"  *******",
				"   *****",
				"    ***",
				"     *"
				)
			);
		
		for (String row : Patterns) {
			System.out.println(row);
		}
	}

}
