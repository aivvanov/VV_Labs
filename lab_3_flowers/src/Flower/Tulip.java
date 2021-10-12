package Flower;

class Tulip extends Flower{
    Tulip(double price, String name){
        this.price = price;
        this.name = name;
        total += price;
        sum += 1;
    }
}
