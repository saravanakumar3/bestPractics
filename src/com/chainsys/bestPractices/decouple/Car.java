package com.chainsys.bestPractices.decouple;
// Object of this class can work only petrol engine and steel
//The car class is tightcoupled with petrol engine class and steel class
public class Car {
	 private IEngine engine; //Early bound with petrol engine
	    private Iwheel[] wheels; //Early bound with wheel interface
	    //The type of engine, and the type of wheel will be injected to the car class
	    //At runtime using the constructors. This is called as constructor based 
	    //dependency injection
	    
	    public Car(IEngine engine,Iwheel[] wheel) {
	        this.engine = engine;
	        this.wheels = wheel;
	    }
	    public void startCar() {
	        engine.start();
	        wheels[0].rotate();
	        wheels[1].rotate();
	        wheels[2].rotate();
	        wheels[3].rotate();
	    }
	    public Iwheel[] getWheels()
	    {
	        return this.wheels;
	    }
	}
