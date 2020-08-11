package com.company;

public class Car {
    private String brand;
    private String model;
    private String type;
    private int hp=1;
    private boolean isEuropean;
    private int doorsNumber;
    private boolean sSuv=false;

    public Car(){

    }

    public Car(String brand,String model,String type,int hp,boolean isEuropean,int doorsNumber,boolean sSuv){
        if(brand!=model){
            this.brand=brand;
            this.model=model;
        }

        if(sSuv=true){
            if(hp<=500 && isEuropean=false){
                this.sSuv=sSuv;
            }
        }

        if(type="coupe"){
            if(doorsNumber<=3){
                this.type=type;}
        }

        if(hp<=1000){
            this.hp=hp;
        }

        this.isEuropean=isEuropean;
        this.doorsNumber=doorsNumber;
        this.sSuv=sSuv;

    }

    public String getBrand(){
        return brand;
    }

    public String getModel(){
        return model;
    }

    public String getType(){
        return type;
    }

    public int getDoorsNumber(){
        return doorsNumber;
    }

    public int getHp(){
        return hp;
    }

    public boolean getIsEuropean(){
        return isEuropean;
    }

    public boolean getsSuv(){
        return sSuv;
    }
}
