package factoryCode;

public class OperationSub extends Operation{

	public OperationSub(double a, double b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public Double getResult() {
		return a-b;
	}
}
