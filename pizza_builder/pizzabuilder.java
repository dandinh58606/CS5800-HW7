package pizza_builder;

import java.util.ArrayList;
import java.util.List;

import pizza_builder.pizza.Size;
import pizza_builder.pizza.Topping;

public abstract class pizzabuilder {
    protected String chain_name;
    protected Size pizza_size;
    protected List<Topping> toppings = new ArrayList<>(); 
    public pizzabuilder(){};

    public pizzabuilder setSize(pizza.Size size)
    {
        this.pizza_size = size;
        return this;
    }

    public pizzabuilder setToppings(pizza.Topping toppings)
    {
        this.toppings.add(toppings);
        return this;
    }

    public abstract pizza build_pizza();

}
