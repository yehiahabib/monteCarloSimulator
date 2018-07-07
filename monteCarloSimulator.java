import java.util.Random;

public class monteCarloSimulator {
	
  public static void main(String[] args) {
    
	Random rand = new Random();
    int inTheCircle = 0;
    int a;
    for (a = 1; a <= 1000000; a++) {
      double x = rand.nextDouble();
      double y = rand.nextDouble();
      if (x * x + y * y <= 1) {
        inTheCircle++;
      }
    }
    System.out.println((4.0 * inTheCircle) / 1000000);
  }
}
