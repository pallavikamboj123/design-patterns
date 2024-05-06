package classes;

import Interaface.FlyBehaviour;

class FlyNoWays implements FlyBehaviour {
  @Override
  public void fly() {
    System.out.println("This doesn't fly");
  }
}
