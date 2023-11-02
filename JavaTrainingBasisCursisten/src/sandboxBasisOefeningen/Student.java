package sandboxBasisOefeningen;

public class Student {
	private double marks1, marks2, marks3; //instance variabelen
	private double maxMarks = 100;         //instance variabele
	
	public double getAverage() {
		double avg = 0;                    //locale variabele
		avg = ((marks1 + marks2 + marks3) / (maxMarks * 3)) * 100;
		return avg;
	}
	
//	public void setAverage(double val) {
////		avg = val;						 //dit mag niet avg in onbenaderbaar buiten de methode getAverage
//	}
}

