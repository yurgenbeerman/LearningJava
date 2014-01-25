package strategy.ducks;

import strategy.behaviors.FlyNoWay;
import strategy.behaviors.MuteQuack;
import strategy.behaviors.Quack;
import strategy.behaviors.Squeak;

/**
 * Created by Lena on 24.01.14.
 */
public class ModelDuck extends Duck {
    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    public void display(){
        System.out.println("I'm a Model duck!");
    }
}
