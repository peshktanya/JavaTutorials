package Lesson12;

public class Lesson12Array1 {
    public static void main(String[] args) {

        int[] mice = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        for (int i = 0; i < mice.length; i++)
            System.out.print(" " + mice[i]);
        System.out.println("\n");

        String[] toppings = new String[10];
        toppings[0] = "Cheese";
        toppings[1] = "Pepperoni";
        toppings[2] = "Black Olives";
        for (int i=0; i<toppings.length; i++)
        {
            System.out.print(toppings[i] + " ");
        }
        System.out.println("\n");

        String[] iceCream = {"Banana", "Cherry", "Blackberry", "Vanilla"};
        for (String s: iceCream)
        {
            System.out.print(s + " ");
        }

    }
}
