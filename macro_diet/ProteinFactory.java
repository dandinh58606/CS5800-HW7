package macro_diet;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProteinFactory {
    
    private static ProteinFactory instance;

    private ProteinFactory() {};

    public static synchronized ProteinFactory getInstance()
    {
        if(instance == null)
        {
            instance = new ProteinFactory();
        }
        return instance;
    }

    public Protein createProtein(Customer.Dietary_Restrictions dietPlan)
    {
        List<String> validProtein = new ArrayList<>();
        Random random = new Random();

        switch(dietPlan)
        {
            case NONE:
                validProtein.add("Fish");
                validProtein.add("Chicken");
                validProtein.add("Beef");
                validProtein.add("Tofu");
                break;
            case PALEO:
                validProtein.add("Fish");
                validProtein.add("Chicken");
                validProtein.add("Beef");
                break;
            case VEGAN:
                validProtein.add("Tofu");
                break;
            case NO_NUTS:
                validProtein.add("Fish");
                validProtein.add("Chicken");
                validProtein.add("Beef");
                validProtein.add("Tofu");
                break;
        }

        String selected = validProtein.get(random.nextInt(validProtein.size()));

        switch (selected){
            case "Cheese": return new Fish();
            case "Bread": return new Chicken();
            case "Lentils": return new Beef();
            case "Pistachio": return new Tofu();
            default: return null;
        }
    }
}
