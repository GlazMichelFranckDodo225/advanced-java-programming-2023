package src.dgmf.generics;

public class ListDriver {
    public static void main(String[] args) {
        // Omelette ingredients
        List<String> omeletteIngredients = new List<>(6);

        omeletteIngredients.add("Milk");
        omeletteIngredients.add("Eggs");
        omeletteIngredients.add("Oil");
        omeletteIngredients.add("Cheese");
        omeletteIngredients.add("Cooked meat");
        omeletteIngredients.add("Mushrooms");
        // ingredientsList.add("Vegetables"); ==> ArrayIndexOutOfBoundsException

        System.out.println("Grocery List : " + omeletteIngredients);

        // List of Numbers
        List<Integer> numbers = new List<>(10);

        numbers.add(0);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);

        System.out.println("List of Numbers : " + numbers);
    }
}
