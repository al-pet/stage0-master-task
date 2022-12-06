package com.epam.OOP;

public class Bird extends Animal {
  Bird () {
    super () {
      color = "blue";
      numberOfPaws = 2;
      hasFur = false;
    }
    public static void getDescription() {
      return Animal.getDescription() + "Moreover, it has 2 wings and can fly.";
    }
  }
  public static birdDescription () {
    system.out.println(Bird.getDescription())
}
}
