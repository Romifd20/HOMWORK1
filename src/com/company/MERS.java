package com.company;

public class MERS {

    public final class AudiTT extends MERSEDES{

        private double engineCapacity;

        public AudiTT(NAMESS name, String color, int year, Number numberOfDoors, String whichCountryfrom, double engineCapacity) {
            super(name,color, year, numberOfDoors, whichCountryfrom);
            this.engineCapacity = engineCapacity;
        }

        public double getEngineCapacity(){
            return engineCapacity;
        }

        @Override
        public void makeSignal() {
            System.out.println("paap-paap");
        }

        @Override
        public void getInfo() {
            super.getInfo();
            System.out.println("Engine capasity is: " + engineCapacity);
        }
    }
}
