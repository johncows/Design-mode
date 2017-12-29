package factoryCode;

public class OperationDiv extends Operation{

	public OperationDiv(double a, double b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public Double getResult() {
		if (b==0) {
			System.err.println("error input ");
			return 0.0;
		}
		else {
			return a/b;
		}
	}

}
