package pizza_builder;

import java.util.ArrayList;
import java.util.List;

import pizza_builder.pizza.Chain;
import pizza_builder.pizza.Size;
import pizza_builder.pizza.Topping;

public class pizzabuilder {
    protected Chain chain_name;
    protected Size pizza_size;
    protected List<Topping> toppings = new ArrayList<>(); 
    public pizzabuilder(){};

    public pizzabuilder setChain(pizza.Chain name)
    {
        this.chain_name = name;
        return this;
    }

    public pizzabuilder setSize(pizza.Size size)
    {
        this.pizza_size = size;
        return this;
    }

    public pizzabuilder addToppings(pizza.Topping topping)
    {
        this.toppings.add(topping);
        return this;
    }

    public pizza build_pizza()
    {
        return new pizza(chain_name, pizza_size, toppings);
    }

}
