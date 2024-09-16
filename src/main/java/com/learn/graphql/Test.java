package com.learn.graphql;

public class Test {
	
	
	public static void main(String[] args) {
		final double d = 1.0 / 2;
		System.out.println(d);
	}

	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 *   
	 * 
	 * 
	 * 1.What is difference between String, StringBuffer and String Builder?
	 * =>String is immutable class. In order JDks the recommendation when
	 * programmatically building a string was to use StringBuffer Since this was
	 * optimized to concatenated multiple String together.However, the methods
	 * StringBuffer were marked as synchronized, which meant that there was a
	 * performance penalty, hence StringBuilder was introduced to provide a
	 * non-synchronized way to efficiently concatenate and modifyStrings.
	 * 
	 * 2.What is JIT?
	 * =>The JIt is the JVMs mechanism by which  can optimize code at runtime.
	 * JIT means Just In Time. It is a central feature of any JVM. Among other optimization,
	 * it can perform code inlining, lock coarsening or lock eliding, escape analysis etc.
	 * 
	 * The main benefit of the JIT is on the programmers side: Code should be written that it just
	 * works:if the code can be optimized at runtime, more often that not, the, JIT will find a way.
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

}
