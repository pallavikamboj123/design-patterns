package classes;

import Interaface.QuackBehaviour;

class Squeak implements QuackBehaviour {
  @Override
  public void quack() {
    System.out.println("It squeaks");
  }
}



