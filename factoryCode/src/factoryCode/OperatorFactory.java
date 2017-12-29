package factoryCode;

public class OperatorFactory {
	public static double getResult(double a,double b,char o) {
		Operation operation = null;
		switch (o) {
		case '+':
			operation = new OperationAdd(a, b);
			break;
		case '-':
			operation = new OperationSub(a, b);		
			break;
		case '*':		
			break;
		case '/':
			operation = new OperationDiv(a, b);		
			break;
		default:
			break;
		}
		
		return operation.getResult();

	}
}
