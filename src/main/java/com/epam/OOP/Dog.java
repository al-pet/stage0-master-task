package com.epam.OOP;

public class Dog extends Animal {
  Dog () {
    super ("brown", 4, true);
  }
  public static void dogDescription () {
    System.out.println(getDescription ());
  }  
}
