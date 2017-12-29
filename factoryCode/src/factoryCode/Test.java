package factoryCode;

public class Test {
	public static void main(String[] args) {
		Operation operation = null;
		double a=5.0,b=0;
		char o = '/'; //选择操作符 实例化不同对象		
		System.out.println("the result is "+OperatorFactory.getResult(a, b, o));
		
	}
}
