package Day4PracticeProblem;

public class LineComparison {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Line Comparison Computation Program");
		double line1 = lineLenght(0.0,0.0,8.0,1.0);
		
		System.out.println("Lenght of line is :" + line1);
	}

	public static double lineLenght(double x1, double y1, double x2, double y2) {
		 double lenght = Math.sqrt(Math.pow((x2 - x1),2) - Math.pow((y2 - y1),2));
		 return lenght;	
	}
}
