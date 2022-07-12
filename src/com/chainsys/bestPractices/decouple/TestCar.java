package com.chainsys.bestPractices.decouple;

public class TestCar {
	public static void main(String[] args) {
		        PetrolEngine pe=new PetrolEngine();
		        SteelWheels[] sWheels = new SteelWheels[4];
		        sWheels[0]=new SteelWheels();
		        sWheels[0].location="front right";
		        sWheels[1]=new SteelWheels();
		        sWheels[1].location="front left";
		        sWheels[2]=new SteelWheels();
		        sWheels[2].location="back right";
		        sWheels[3]=new SteelWheels();
		        sWheels[3].location="back left";
		        Car car = new Car(pe, sWheels);
		        car.startCar();
		        SteelWheels[] carWheels = (SteelWheels[])car.getWheels();
		        int length = carWheels.length;
		        for(int i=0; i<length; i++)
		        {
		            System.out.println(carWheels[i].location);
		        }
		        
		        DieselEngine de=new DieselEngine();
		        WoodenWheel[] wWheels = new WoodenWheel[4];
		        wWheels[0]=new WoodenWheel();
		        wWheels[0].location="front right";
		        wWheels[1]=new WoodenWheel();
		        wWheels[1].location="front left";
		        wWheels[2]=new WoodenWheel();
		        wWheels[2].location="back right";
		        wWheels[3]=new WoodenWheel();
		        wWheels[3].location="back left";
		        Car secondCar = new Car(de, wWheels);
		        secondCar.startCar();
		        
		        WaterEngine we=new WaterEngine();
		        Car thirdCar=new Car(we,wWheels);
		        thirdCar.startCar();
		    }
	
}
