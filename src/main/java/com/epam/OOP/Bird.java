package com.epam.OOP;

public class Bird extends Animal {
  Bird () {
    super ("blue", 2, false);
  }
  public static String getDescription () {
    return Animal.getDescription () + "Moreover, it has 2 wings and can fly.";
  }
  public static void birdDescription () {
    System.out.println(getDescription ());
  }
}
