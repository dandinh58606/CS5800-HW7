package macro_diet;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CarbsFactory {
    
    private static CarbsFactory instance;

    private CarbsFactory() {};

    public static synchronized CarbsFactory getInstance()
    {
        if(instance == null)
        {
            instance = new CarbsFactory();
        }
        return instance;
    }

    public Carbs createCarb(Customer.Dietary_Restrictions dietPlan)
    {
        List<String> validCarbs = new ArrayList<>();
        Random random = new Random();

        switch(dietPlan)
        {
            case NONE:
                validCarbs.add("Cheese");
                validCarbs.add("Bread");
                validCarbs.add("Lentils");
                validCarbs.add("Pistachio");
                break;
            case PALEO:
                validCarbs.add("Pistachio");
                break;
            case VEGAN:
                validCarbs.add("Bread");
                validCarbs.add("Lentils");
                validCarbs.add("Pistachio");
                break;
            case NO_NUTS:
                validCarbs.add("Cheese");
                validCarbs.add("Bread");
                validCarbs.add("Lentils");
                break;
        }

        String selected = validCarbs.get(random.nextInt(validCarbs.size()));

        switch (selected){
            case "Cheese": return new Cheese();
            case "Bread": return new Bread();
            case "Lentils": return new Lentils();
            case "Pistachio": return new Pistachio();
            default: return null;
        }
    }
}
