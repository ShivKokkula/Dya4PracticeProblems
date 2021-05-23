package Day4PracticeProblem;

public class LineComparison {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Line Comparison Computation Program");
		double line1 = lineLenght(0.0,0.0,8.0,1.0);
		double line2 = lineLenght(0.0,0.0,8.0,1.0);
		equals(line1,line2);
	}

	public static double lineLenght(double x1, double y1, double x2, double y2) {
		 double lenght = Math.sqrt(Math.pow((x2 - x1),2) - Math.pow((y2 - y1),2));
		 return lenght;	
	}
	
	public static void equals(double lineOneLenght, double lineTwoLenght) {
		String line1 = Double.toString(lineOneLenght);
		String line2 = Double.toString(lineTwoLenght);
		
		if(line1.equals(line2)) {
			System.out.println("Two lines are equal");
		}else {
			System.out.println("Two lines are not equal");
		}
		
	}
}
