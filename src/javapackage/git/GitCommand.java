package javapackage.git;

class Action{
	double a = 45,b = 5,sum;
	double value=0;
	public void addTwoNumber() {
		sum = a+b;
		System.out.println("Sum: "+sum);
	}
	public void minusTwoNumber() {
		value = a - b;
		System.out.println("Subtract: "+value);
	}
	public void multipleTwoNumber() {
		value = a * b;
		System.out.println("Multiply value: "+value);
	}
	public void divideTwoNumber() {
		value = a / b;
		System.out.println("Division: "+value);
	}
}
public class GitCommand {

	public static void main(String[] args) {
		Action action = new Action();
		action.addTwoNumber();
		action.minusTwoNumber();
		action.multipleTwoNumber();
		action.divideTwoNumber();

	}

}
