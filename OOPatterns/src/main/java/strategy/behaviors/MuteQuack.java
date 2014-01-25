package strategy.behaviors;

/**
 * Created by Lena on 24.01.14.
 */
public class MuteQuack implements QuackBehavior {
    public void quack(){
        System.out.println("<<<silence>>>");
    }
}
