package com.company;

public class MERSEDES {
    protected void getInfo() {
    }

    public class Audi extends CAR {

        private String fromWhichCountry;


        public Audi(NAMESS name, String color, int year, NUMBERS numberOfDoors, String fromWhichCountry) {
            super(name, color, year, numberOfDoors);
            this.fromWhichCountry = fromWhichCountry;
        }

        public String getFromWhichCountry(){
            return fromWhichCountry;
        }



        @Override
        public void makeSignal() {
            System.out.println("pii-piip");

        }

        @Override
        public void getInfo() {
            super.getInfo();
            System.out.println("This car from " + fromWhichCountry);
        }
    }



}


