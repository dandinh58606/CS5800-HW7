package macro_diet;

public class Main {
    public static void main(String[] args)
    {
        DietFactory diets = DietFactory.getInstance();

        Customer user1 = new Customer("Alice Fortescue", Customer.Dietary_Restrictions.PALEO);

        diets.createMealPlan(user1);

        user1.printCustomerDetails();
    }
}
