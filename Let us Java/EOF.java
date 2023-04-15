import java.util.*;

public class EOF {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in); // Added source parameter in constructor.
        int counter = 1; // Initialization of counter is done outside while loop, otherwise it will always get initialized by 1 in while loop
        while (line.hasNextLine()) {
            String lineStr = line.nextLine(); // changed variable name to lineStr, because 2 variable can't be declared with the same name in a method.
            System.out.println(counter + " " + lineStr);
            counter++;
        }
    }
}   

// line.hasNextLine() returns true if the scanner has another token in its input.
// nextLine() method advances this scanner past the current line and returns the
//  input that was skipped.