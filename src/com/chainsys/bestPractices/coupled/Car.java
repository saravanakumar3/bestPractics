package com.chainsys.bestPractices.coupled;
// Object of this class can work only petrol engine and steel
//The car class is tightcoupled with petrol engine class and steel class
public class Car {
	private PetrolEngine engine;  //early bound with petrol engine
    private SteelWheels[] wheels; //early bound with steelwheel
    
    public Car()
    {
        engine = new PetrolEngine();
        wheels = new SteelWheels[4];
        wheels[0] = new SteelWheels();
        wheels[0].location="front left";
        wheels[1] = new SteelWheels();
        wheels[1].location="front right";
        wheels[2] = new SteelWheels();
        wheels[2].location="back left";
        wheels[3] = new SteelWheels();
        wheels[3].location="back right";
    }
    public Car(PetrolEngine engine,SteelWheels[] wheel)
    {
        this.engine = engine;
        this.wheels = wheel;
        wheels[0].location="front left";
        wheels[1].location="front right";
        wheels[2].location="back left";
        wheels[3].location="back right";
    }
    
    public void startCar()
    {
        engine.start(); 
        wheels[0].rotate();
        wheels[1].rotate();
        wheels[2].rotate();
        wheels[3].rotate();
    }
    public void stopCar() {
    	engine.stop();
    	wheels[0].stopRotate();
    	wheels[1].stopRotate();
    	wheels[2].stopRotate();
    	wheels[3].stopRotate();
    }
}
