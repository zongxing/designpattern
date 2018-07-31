package com.mashensoft.state;

public class Test {

	public static void main(String[] args) {
		State state = new State();
		state.setValue("state1");
		Context context = new Context();
		context.setState(state);
		context.method();
		state.setValue("state2");
		context.method();
	}

}
