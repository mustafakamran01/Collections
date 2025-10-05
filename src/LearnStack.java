import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {

        Stack<String> animals = new Stack<>();
        //LIFO

        animals.push("Dog");
        animals.push("Lion");
        animals.push("Horse");
        animals.push("Cat");

        System.out.println(animals);

        System.out.println(animals.peek()); // it will print the element which is inserted at last

        animals.pop();  // it will remove the element from the top

        System.out.println(animals.peek());
    }
}
