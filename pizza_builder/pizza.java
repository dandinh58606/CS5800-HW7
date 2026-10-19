package pizza_builder;

import java.util.List;

public class pizza {
    public enum Size {
        SMALL, MEDIUM, LARGE
    }

    public enum Topping {
        PEPPERONI, SAUSAGE, MUSHROOMS, BACON, ONION, EXTRA_CHEESE,
        PEPPERS, CHICKEN, OLIVES, SPINACH, TOMATO_AND_BASIL, BEEF,
        HAM, PESTO, SPICY_PORK, HAM_AND_PINEAPPLE
    }

    public enum Chain {
        PIZZA_HUT, DOMINOS, LITTLE_CAESARS
    }

    private Chain chain_name;
    private Size size;
    private List<Topping> toppings; 

    private pizza(){};
    public pizza(Chain name, Size size, List<Topping> toppings){
        this.chain_name = name;
        this.size = size;
        this.toppings = toppings;
    }

    public Chain getChainName()
    {
        return chain_name;
    }

    public Size getSize()
    {
        return size;
    }

    public List<Topping> getToppings()
    {
        return toppings;
    }

    public void eat()
    {
        System.out.println("---Pizza Details---");
        System.out.println("Chain Name: " + chain_name);
        System.out.println("Size: "+ size);
        System.out.println("Toppings:");
        if(toppings.isEmpty())
        {
            System.out.println("  - Cheese (no extras)");
        }
        else
        {
            for(Topping pizza_topping: toppings)
            {
                System.out.println("  -" + pizza_topping);
            }
        }
        System.out.println();
    }
}