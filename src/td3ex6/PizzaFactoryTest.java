package td3ex6;

public class PizzaFactoryTest {
	public static void main(String[] args)
	{
		PizzaFactory factory = new AlgerianPizzaFactory();
        Pizza cheesePizza = factory.createPizza("cheese");
        Pizza seafoodPizza = factory.createPizza("seafood");
        Pizza vegetarianPizza = factory.createPizza("vegetarian");
        
        cheesePizza.cook();
	}
}
