package classes;

public class Main {
  public static void main(String[] args) {
    Duck mallardDuck = new MallardDuck();

    mallardDuck.setFlyBehaviour(new FlyWithWings());
    mallardDuck.setQuackBehaviour(new Quack());

    mallardDuck.performFly();
    mallardDuck.performQuack();
    mallardDuck.swim();
    mallardDuck.display();

    Duck woodenDuck = new WoodenDuck();

    woodenDuck.setQuackBehaviour(new Mute());
    woodenDuck.setFlyBehaviour(new FlyNoWays());

    woodenDuck.display();
    woodenDuck.swim();
    woodenDuck.performFly();
    woodenDuck.performQuack();

  }
}