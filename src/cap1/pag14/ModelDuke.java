package src.cap1.pag14;

public class ModelDuke extends Duck {
    public ModelDuke() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck");
    }
}