package pizza_builder;

public class Main {
    public static void main(String[] args) {
        System.out.println("---Part 1 Pizzas---");

        pizza genericPizza_1 = new pizzabuilder()
        .setChain(pizza.Chain.PIZZA_HUT)
        .setSize(pizza.Size.SMALL)
        .addToppings(pizza.Topping.PEPPERONI)
        .addToppings(pizza.Topping.SAUSAGE)
        .addToppings(pizza.Topping.EXTRA_CHEESE)
        .build_pizza();

        genericPizza_1.eat();

        pizza genericPizza_2 = new pizzabuilder()
        .setChain(pizza.Chain.PIZZA_HUT)
        .setSize(pizza.Size.MEDIUM)
        .addToppings(pizza.Topping.BEEF)
        .addToppings(pizza.Topping.MUSHROOMS)
        .addToppings(pizza.Topping.BACON)
        .addToppings(pizza.Topping.CHICKEN)
        .addToppings(pizza.Topping.PEPPERS)
        .addToppings(pizza.Topping.OLIVES)
        .build_pizza();

        genericPizza_2.eat();

        pizza genericPizza_3 = new pizzabuilder()
        .setChain(pizza.Chain.PIZZA_HUT)
        .setSize(pizza.Size.LARGE)
        .addToppings(pizza.Topping.ONION)
        .addToppings(pizza.Topping.HAM_AND_PINEAPPLE)
        .addToppings(pizza.Topping.PEPPERONI)
        .addToppings(pizza.Topping.BACON)
        .addToppings(pizza.Topping.EXTRA_CHEESE)
        .addToppings(pizza.Topping.SPICY_PORK)
        .addToppings(pizza.Topping.TOMATO_AND_BASIL)
        .addToppings(pizza.Topping.SPINACH)
        .addToppings(pizza.Topping.SAUSAGE)
        .build_pizza();

        genericPizza_3.eat();


        System.out.println("--- Part 2 Pizzas--- ");

        pizza PizzaHut_Pizza_1 = new pizzabuilder()
        .setChain(pizza.Chain.PIZZA_HUT)
        .setSize(pizza.Size.LARGE)
        .addToppings(pizza.Topping.MUSHROOMS)
        .addToppings(pizza.Topping.PESTO)
        .addToppings(pizza.Topping.PEPPERONI)
        .build_pizza();

        PizzaHut_Pizza_1.eat();

        pizza PizzaHut_Pizza_2 = new pizzabuilder()
        .setChain(pizza.Chain.PIZZA_HUT)
        .setSize(pizza.Size.SMALL)
        .addToppings(pizza.Topping.EXTRA_CHEESE)
        .addToppings(pizza.Topping.MUSHROOMS)
        .build_pizza();

        PizzaHut_Pizza_2.eat();

        pizza LilCaesar_Pizza_1 = new pizzabuilder()
        .setChain(pizza.Chain.LITTLE_CAESARS)
        .setSize(pizza.Size.MEDIUM)
        .addToppings(pizza.Topping.HAM_AND_PINEAPPLE)
        .addToppings(pizza.Topping.PEPPERONI)
        .addToppings(pizza.Topping.BACON)
        .addToppings(pizza.Topping.EXTRA_CHEESE)
        .addToppings(pizza.Topping.SPICY_PORK)
        .addToppings(pizza.Topping.TOMATO_AND_BASIL)
        .addToppings(pizza.Topping.SPINACH)
        .addToppings(pizza.Topping.SAUSAGE)
        .build_pizza();

        LilCaesar_Pizza_1.eat();

        pizza LilCaesar_Pizza_2 = new pizzabuilder()
        .setChain(pizza.Chain.LITTLE_CAESARS)
        .setSize(pizza.Size.SMALL)
        .addToppings(pizza.Topping.BEEF)
        .addToppings(pizza.Topping.MUSHROOMS)
        .addToppings(pizza.Topping.BACON)
        .addToppings(pizza.Topping.CHICKEN)
        .addToppings(pizza.Topping.PEPPERS)
        .addToppings(pizza.Topping.OLIVES)
        .build_pizza();

        LilCaesar_Pizza_2.eat();

        pizza Domino_Pizza_1 = new pizzabuilder()
        .setChain(pizza.Chain.DOMINOS)
        .setSize(pizza.Size.SMALL)
        .addToppings(pizza.Topping.EXTRA_CHEESE)
        .build_pizza();

        Domino_Pizza_1.eat();

        pizza Domino_Pizza_2 = new pizzabuilder()
        .setChain(pizza.Chain.DOMINOS)
        .setSize(pizza.Size.LARGE)
        .addToppings(pizza.Topping.PEPPERONI)
        .addToppings(pizza.Topping.SAUSAGE)
        .addToppings(pizza.Topping.SPICY_PORK)
        .build_pizza();

        Domino_Pizza_2.eat();
    }
}
