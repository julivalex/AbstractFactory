import pizza.Pizza;
import store.NyStylePizzaStore;
import store.PizzaStore;

public class SimplePizzaFactory {

    public static void main(String[] args) {
        PizzaStore nyStore = new NyStylePizzaStore();
        Pizza pizzaCheese = nyStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizzaCheese.getName() + "\n");
    }
}
