package classes;

import Interaface.FlyBehaviour;
import Interaface.QuackBehaviour;

abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public void performFly() {
      flyBehaviour.fly();
    }

    public void performQuack() {
      quackBehaviour.quack();
    }

    public abstract void display();

    public void swim() {
    System.out.println("classes.Duck Swims");
  }

  public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
      this.flyBehaviour = flyBehaviour;
  }

  public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
      this.quackBehaviour = quackBehaviour;
  }
}