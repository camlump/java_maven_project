package hello;

import org.joda.time.LocalTime;

public class HelloWorld {
  public static void main(String[] args) {
    LocalTime currentTime = new LocalTime();
    System.out.println("The current local time is: " + currentTime);
    Greeter greeter = new Greeter();
    Health health = new Health();
    System.out.println(greeter.sayHello());
    System.out.println(health.healthCheck());
    System.out.println("test build");
  }
}