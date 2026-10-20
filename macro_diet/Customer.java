package macro_diet;

import java.util.ArrayList;

public class Customer {
    public enum Dietary_Restrictions {
        NONE, PALEO, VEGAN, NO_NUTS
    }

    private String full_name;
    private Dietary_Restrictions restrictions;
    private Carbs carb;
    private Protein protein;
    private Fats fats;

    public Customer(String name, Dietary_Restrictions restrictions)
    {
        this.full_name = name;
        this.restrictions = restrictions;
    }

    public String getName()
    {
        return full_name;
    }

    public Dietary_Restrictions getRestrictions()
    {
        return restrictions;
    }

    public void setMeal(Carbs carb, Protein protein, Fats fats)
    {
        this.carb = carb;
        this.protein = protein;
        this.fats = fats;
    }

    public void printCustomerDetails() {
    System.out.println("Customer: " + full_name + " | Diet: " + restrictions);
    System.out.println("  - Carb: " + (carb != null ? carb : "None"));
    System.out.println("  - Protein: " + (protein != null ? protein : "None"));
    System.out.println("  - Fat: " + (fats != null ? fats : "None"));
    System.out.println();
}
}
