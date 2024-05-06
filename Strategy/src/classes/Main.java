package classes;

public class Main {
  public static void main(String[] args) {
    Duck mallardDuck = new MallardDuck();

    mallardDuck.performFly();
    mallardDuck.performQuack();
    mallardDuck.swim();
    mallardDuck.display();

    Duck woodenDuck = new WoodenDuck();

    woodenDuck.display();
    woodenDuck.swim();
    woodenDuck.performFly();
    woodenDuck.performQuack();

  }
}