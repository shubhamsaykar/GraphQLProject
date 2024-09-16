package com.learn.graphql.helper;

public class ExceptionHelper {

	public static RuntimeException throwResourceNotFoundException() {
		return new RuntimeException("Resouce Not Found !!!");
	}
	
}
