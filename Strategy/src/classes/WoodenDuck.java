package classes;

public class WoodenDuck extends Duck {
  public WoodenDuck() {
      flyBehaviour = new FlyNoWays();
      quackBehaviour = new Mute();
  }

  @Override
  public void display() {
    System.out.println("This is a wooden Duck");
  }
}
