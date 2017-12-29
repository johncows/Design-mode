package factoryCode;

public class OperationAdd extends Operation {
	
	public OperationAdd(double a, double b) {
		super(a, b);
	}
	
	
	@Override
	public Double getResult() {
		return a+b;
	}
}
