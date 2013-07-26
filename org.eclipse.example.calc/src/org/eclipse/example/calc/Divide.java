package org.eclipse.example.calc;

public class Divide implements BinaryOperation {

	@Override
	public String getName() {
		return "/";
	}

	@Override
	public float perform(float arg1, float arg2) {
		return arg1 / arg2;
	}

}
