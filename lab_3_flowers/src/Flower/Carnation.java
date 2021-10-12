package Flower;

class Carnation extends Flower{
    Carnation(double price, String name){
        this.price = price;
        this.name = name;
        total += price;
        sum += 1;
    }
}
