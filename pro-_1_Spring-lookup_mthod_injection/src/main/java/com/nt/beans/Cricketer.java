package com.nt.beans;

public abstract class Cricketer {
//this is target class
	public  abstract Cricket instanceCricket();
	
	public void feilding()
	{
		System.out.println("the feilder is feilding");
	}
	public void bolwing()
	{
		System.out.println("the feilder is feilding");
	}
	public void wicketKeeping()
	{
		System.out.println("the wicketkeeper is doing wicket keeping");
	}
	public void getScore(String name)
	{
		Cricket cri=instanceCricket();
		int score=cri.score();
		System.out.println("the score is"+score);
	}
}
