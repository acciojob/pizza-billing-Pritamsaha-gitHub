package com.driver;

public class Pizza {

    private int price;//total bill calculation
    private Boolean isVeg;
    private String bill;
    private int toppingsPrice;
    private int cheesPrice;
    private int takeAwayPrice;
    boolean isCheesAdded;
    boolean isToppingsAdded;
    boolean isTakeAwayAdded;
    boolean isBillGenerated;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.cheesPrice=80;
        this.takeAwayPrice=20;
        if(isVeg==true){
            this.price=300;
            this.toppingsPrice=70;
        }else{
            this.price=400;
            this.toppingsPrice=120;
        }
        this.isCheesAdded=false;
        this.isToppingsAdded=false;
        this.isTakeAwayAdded=false;

        this.bill= "Base Price Of The Pizza: "+ this.price +"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheesAdded==false){
            this.price= this.price + this.cheesPrice;
            this.isCheesAdded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingsAdded==false){
            this.price= this.price + this.toppingsPrice;
            this.isToppingsAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isTakeAwayAdded==false){
            this.price= this.price + this.takeAwayPrice;
            this.isTakeAwayAdded=true;
        }

    }

    public String getBill(){
        // your code goes here
        if(isBillGenerated==false){
            if(isCheesAdded==true){
                this.bill= this.bill + "Extra Cheese Added: "+ this.cheesPrice +"\n";
            }
            if(isToppingsAdded==true){
                this.bill= this.bill + "Extra Toppings Added: "+this.toppingsPrice+"\n";
            }
            if(isTakeAwayAdded==true){
                this.bill = this.bill + "Paperbag Added: " +this.takeAwayPrice+"\n";
            }
            this.bill = this.bill +"Total Price: "+this.price+"\n";
            this.isBillGenerated=true;
        }
        return this.bill;
    }
}
