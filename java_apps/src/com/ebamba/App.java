package com.ebamba;

import java.time.LocalDate;
import java.util.Date;

public class App {

  public static void main(String[] args) throws Exception {
    System.out.println("Hello, World!");
    LocalDate date = LocalDate.now();
    System.out.println(date.getMonth());
    /**
     * What is the difference between primitives and reference types
     */
    int a = 10;
    int b = a; // This is simply a copy of the value of a in memory
    a = 20; // This changes the value of a in memory
    //both a and b are primitive types
    System.out.println(a == b); // This will print false because a and b are different in memory
    Person manu = new Person("Manu");
    Person anotherPerson = manu; // Both of these variables point to the same memory reference
    System.out.println("Before changing Manu's name");
    System.out.println(manu.name + " " + anotherPerson.name);
    anotherPerson.name = "Emmanuel";
    System.out.println("After changing Manu's name");
    System.out.println(manu.name + " " + anotherPerson.name);
    /**
     * How to name your variables
     */
    int subscriberCount = 0;
    // String class
    String myName = "Manu";
    System.out.println(myName.toUpperCase());

    System.out.println(manu.name.substring(0, 3));
    
    liftoff();
  }

  static class Person {
    String name;

    Person(String name) {
      this.name = name;
    }
  }

  public static void liftoff() {
    int[] numbers = new int[10];
    numbers[0] = 1;
    numbers[1] = 2;
    numbers[2] = 3;
    numbers[3] = 4;
    numbers[4] = 5;
    numbers[5] = 6;
    numbers[6] = 7;
    numbers[7] = 8;
    numbers[8] = 9;
    numbers[9] = 10;
    int idx = numbers.length;
    while (idx > 0) {
      System.out.println(idx);
      idx--;
    }
    System.out.println("liftoff while loop!");
    int ix = numbers.length;
    do {
      System.out.println(ix);
      ix--;
    } while (ix > 0);

    System.out.println("liftoff do while!");
    for (int i = numbers.length; i > 0; i--) {
      System.out.println(i);
    }
    System.out.println("liftoff for loop!");
  }
}
