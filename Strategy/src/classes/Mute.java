package classes;

import Interaface.QuackBehaviour;

class Mute implements QuackBehaviour {
  @Override
  public void quack() {
    System.out.println("It's mute");
  }
}
