package com.company;

public class Main {

    public static void main(String[] args) {
	    Car c = new Car("Audi","A7","nou",500,false,4,true);
        System.out.println(c.getBrand());
        System.out.println(c.getModel());
        System.out.println(c.getType());
        System.out.println(c.getDoorsNumber());
        System.out.println(c.getHp());
        System.out.println(c.getIsEuropean());
        System.out.println(c.getsSuv());
    }
}
