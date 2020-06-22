package main;

import methods.HelloWorld;
import methods.Sum;
//import app.Greeting;

public class Main {

    public static void main(String[] args) {

        HelloWorld helloWorld = new HelloWorld();
        helloWorld.print("Sanjana");

        Sum sum = new Sum();
        sum.sum(2, 4);

       // Greeting greeting = new Greeting(); As the packages are not exported so we can't use this class in other module
       // greeting.greeting();

    }
}
