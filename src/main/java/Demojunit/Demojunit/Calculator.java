package Demojunit.Demojunit;

public class Calculator {
CalculatorService service;
public Calculator(CalculatorService s) {
	this.service=s;
}
	public int perform(int i, int j) {
//		incase if we are not using the service add method and to check whether mockito is used or not then we can do like thid
//		return service.add(i, j)*i;
		return (i+j)*i;
	}
}
