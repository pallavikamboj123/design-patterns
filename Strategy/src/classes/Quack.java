package classes;

import Interaface.QuackBehaviour;

class Quack implements QuackBehaviour {
  @Override
  public void quack() {
    System.out.println("It quacks");
  }
}
