package com.chainsys.bestPractices.decouple;

public class TestBike {
	public static void main(String[] args) {
		        PetrolEngine pe=new PetrolEngine();
		        SteelWheels[] sWheels = new SteelWheels[2];
		        sWheels[0]=new SteelWheels();
		        sWheels[0].location="front";
		        sWheels[1]=new SteelWheels();
		        sWheels[1].location="back";
		        Bike bike = new Bike();
		        bike.setEngine(pe);
		        bike.setWheels(sWheels);
		        bike.startBike();
		        SteelWheels[] carWheels = (SteelWheels[])bike.getWheels();
		        int length = carWheels.length;
//		        for(int i=0; i<length; i++)
//		        {
//		            System.out.println(carWheels[i].location);
//		        }

		        DieselEngine de=new DieselEngine();
		        WoodenWheel[] wWheels = new WoodenWheel[2];
		        wWheels[0]=new WoodenWheel();
		        wWheels[0].location="front";
		        wWheels[1]=new WoodenWheel();
		        wWheels[1].location="back";
		        Bike secondBike = new Bike();
		        secondBike.setEngine(de);
		        secondBike.setWheels(wWheels);
		        secondBike.startBike();
		        
		    }
	
}
