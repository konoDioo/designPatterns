package td3ex6;

class AlgerianPizzaFactory implements PizzaFactory {
    public Pizza createPizza(String type) {
        switch (type) {
            case "cheese":
                return new CheesePizza();
            case "seafood":
                return new SeafoodPizza();
            case "vegetarian":
                return new VegetarianPizza();
            default:
                throw new IllegalArgumentException("Invalid pizza type: " + type);
        }
    }
}
