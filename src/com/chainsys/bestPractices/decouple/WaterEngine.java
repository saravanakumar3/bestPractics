package com.chainsys.bestPractices.decouple;

public class WaterEngine implements IEngine{
	@Override
    public void start() {
        System.out.println("Water engine started");
    }

    @Override
    public void stop() {
            System.out.println("Water engine stopped");
    }

}
