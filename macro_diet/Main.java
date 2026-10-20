package macro_diet;

public class Main {
    public static void main(String[] args)
    {
        DietFactory diets = DietFactory.getInstance();

        Customer user1 = new Customer("Alice Fortescue", Customer.Dietary_Restrictions.PALEO);
        Customer user2 = new Customer("Frank Longbottom", Customer.Dietary_Restrictions.NO_NUTS);
        Customer user3 = new Customer("John MacTavish", Customer.Dietary_Restrictions.NONE);
        Customer user4 = new Customer("Kyle Garrick", Customer.Dietary_Restrictions.PALEO);
        Customer user5 = new Customer("Simon Riley", Customer.Dietary_Restrictions.VEGAN);
        Customer user6 = new Customer("Kate Laswell", Customer.Dietary_Restrictions.NONE);

        diets.createMealPlan(user1);
        diets.createMealPlan(user2);
        diets.createMealPlan(user3);
        diets.createMealPlan(user4);
        diets.createMealPlan(user5);
        diets.createMealPlan(user6);

        user1.printCustomerDetails();
        user2.printCustomerDetails();
        user3.printCustomerDetails();
        user4.printCustomerDetails();
        user5.printCustomerDetails();
        user6.printCustomerDetails();
    }
}
