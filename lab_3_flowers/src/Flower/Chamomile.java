package Flower;

class Chamomile extends Flower {
    Chamomile(double price, String name){
        this.price = price;
        this.name = name;
        total += price;
        sum += 1;
    }
}
