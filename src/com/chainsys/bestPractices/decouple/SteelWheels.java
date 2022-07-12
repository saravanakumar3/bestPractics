package com.chainsys.bestPractices.decouple;

public class SteelWheels implements Iwheel{
	 public String location;
	    public void rotate()
	    {
	        System.out.println(location+"  Steel Wheel Rotating");
	    }
	    public void stopRotate()
	    {
	        System.out.println(location+"  Steel Wheel Stopped");
	    }
}
