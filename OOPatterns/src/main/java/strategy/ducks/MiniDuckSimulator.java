package strategy.ducks;

import strategy.behaviors.FlyRocketPowered;

/**
 * Created by Lena on 24.01.14.
 */
public class MiniDuckSimulator {
    public static void main(String[] args){
        System.out.println("--------------- Duck mallard = new MallardDuck(); -----------------");
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        System.out.println("---------------- Duck model = new ModelDuck(); ----------------");
        Duck model = new ModelDuck();
        model.performFly();
        model.performQuack();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

        System.out.println("------------- MallardDuck mallard1 = new MallardDuck(); // want to call display(); -------------------");
        MallardDuck mallard1 = new MallardDuck();
        mallard1.display();
        mallard1.performFly();
    }
}
