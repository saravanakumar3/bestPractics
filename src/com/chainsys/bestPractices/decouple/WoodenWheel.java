package com.chainsys.bestPractices.decouple;

public class WoodenWheel implements Iwheel{
	public String location;
	 public void rotate()
	    {
	        System.out.println(location+"Wooden Wheel Rotating");
	    }
	    public void stopRotate()
	    {
	        System.out.println(location+"Wooden Wheel Stopped");
	    }
}
