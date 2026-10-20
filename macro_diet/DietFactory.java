package macro_diet;

public class DietFactory {
    
    private static DietFactory instance;

    private DietFactory () {};

    public static synchronized DietFactory getInstance()
    {
        if(instance == null)
        {
            instance = new DietFactory();
        }
        return instance;
    }

    public void createMealPlan(Customer customer)
    {
        Customer.Dietary_Restrictions restrictions = customer.getRestrictions();

        Carbs carb = CarbsFactory.getInstance().createCarb(restrictions);
        Protein protein = ProteinFactory.getInstance().createProtein(restrictions);
        Fats fats = FatsFactory.getInstance().createFats(restrictions);

        customer.setMeal(carb, protein, fats);
    }
}
