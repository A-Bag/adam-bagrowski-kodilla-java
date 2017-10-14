package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        //SimpleUser test
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUserName();

        if (result.equals("theForumUser")) {
            System.out.println("User test OK");
        } else {
            System.out.println("Error!");
        }

        //Calculator test
        Calculator calculator = new Calculator();

        int sum = calculator.add(17, 23);

        if (sum == 40){
            System.out.println("Sum test OK");
        }else{
            System.out.println("Sum test error!");
        }

        int difference = calculator.subtract(17,23);

        if (difference == -6){
            System.out.println("Difference test OK");
        }else{
            System.out.println("Difference test error!");
        }
    }
}
