package unit1.livehacks1;
import codehs.*;

/**
 * A simple program
 * @author: E. Fabroa
 *
 */
public class LiveHackProblem1 extends ConsoleProgram{

    public void run() {
      double a = readDouble("The a value is ");
      double A = Math.pow(a,2) * Math.sqrt(3) / 4;
      System.out.println("The face area of a rectangular tetrahedron is " + A);
      

    }
}
