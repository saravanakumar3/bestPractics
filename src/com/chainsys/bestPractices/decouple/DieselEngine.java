package com.chainsys.bestPractices.decouple;

public class DieselEngine implements IEngine{
	 public void start()
	    {
	        System.out.println("Diesel engine started");
	    }
	    public void stop()
	    {
	        System.out.println("Diesel engine Stopped");
	    }
}
