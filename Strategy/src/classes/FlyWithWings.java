package classes;

import Interaface.FlyBehaviour;

class FlyWithWings implements FlyBehaviour {
  @Override
  public void fly() {
    System.out.println("Fly with wings");
  }
}

