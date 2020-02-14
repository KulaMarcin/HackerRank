package com.kulamarcin;

import java.util.Scanner;

interface Food {
    public String getType();
}

class Pizza implements Food {
    public String getType() {
        return "Someone ordered a Fast Food!";
    }
}

class Cake implements Food {
    public String getType() {
        return "Someone ordered a Dessert!";
    }
}

class FoodFactory {
    public Food getFood(String order) {
        return (order.equals("pizza")) ? new Pizza() : new Cake();
    }
}

public class JavaFactoryPattern {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        FoodFactory foodFactory = new FoodFactory();

        Food food = foodFactory.getFood(scanner.next());
        System.out.println(food.getClass());
    }
}
