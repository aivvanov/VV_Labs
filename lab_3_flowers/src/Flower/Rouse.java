package Flower;

class Rouse extends Flower{
    Rouse(double price, String name){
        this.price = price;
        this.name = name;
        total += price;
        sum += 1;
    }
}