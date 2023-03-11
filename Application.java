public class Application{
	public static void main (String[] args){
		Calculator calculator = new Calculator();
		System.out.println(calculator.addition(1,2));
		//should be 3
		System.out.println(calculator.addition(1.5,2.2));
		//should be 4.7
	}
}
