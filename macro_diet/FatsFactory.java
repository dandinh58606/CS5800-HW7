package macro_diet;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FatsFactory {
    
    private static FatsFactory instance;

    private FatsFactory() {};

    public static synchronized FatsFactory getInstance()
    {
        if(instance == null)
        {
            instance = new FatsFactory();
        }
        return instance;
    }

    public Fats createFats(Customer.Dietary_Restrictions dietPlan)
    {
        List<String> validFats = new ArrayList<>();
        Random random = new Random();

        switch(dietPlan)
        {
            case NONE:
                validFats.add("Avocado");
                validFats.add("Sour Cream");
                validFats.add("Tuna");
                validFats.add("Peanuts");
                break;
            case PALEO:
                validFats.add("Avocado");
                validFats.add("Tuna");
                validFats.add("Peanuts");
                break;
            case VEGAN:
                validFats.add("Avocado");
                validFats.add("Peanuts");
                break;
            case NO_NUTS:
                validFats.add("Avocado");
                validFats.add("Sour Cream");
                validFats.add("Tuna");
                break;
        }

        String selected = validFats.get(random.nextInt(validFats.size()));

        switch (selected){
            case "Avocado": return new Avocado();
            case "Sour Cream": return new SourCream();
            case "Tuna": return new Tuna();
            case "Peanuts": return new Peanuts();
            default: return null;
        }
    }
}
