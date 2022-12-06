package com.epam.OOP;

public class Animal {
  private static String color;
  private static int numberOfPaws;
  private static boolean hasFur;
  
  public Animal (String color, int numberOfPaws, boolean hasFur) {
    this.color = color;
    this.numberOfPaws = numberOfPaws;
    this.hasFur = hasFur;  
  }
  public static String getDescription () {
  return "This animal is mostly " + color 
    + "It has " + numberOfPaws + (numberOfPaws == 1 ? "paw" : "paws") 
    + "and " + (hasFur ? 'a' : "no") + "fur.";
  }
}
