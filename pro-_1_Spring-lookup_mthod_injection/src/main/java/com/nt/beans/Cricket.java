package com.nt.beans;

import java.util.Random;

public class Cricket {
//dependennt  class
	public Cricket()
	{
		System.out.println(" thi si 0 param constructer");
	}
	public int score()
	{
		System.out.println("i will retun the score");
		return new Random().nextInt(120);
	}
}
