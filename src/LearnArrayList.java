import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList {
    public static void main(String[] args) {
//        ArrayList<String> studentName = new ArrayList<>();
        List<Integer> li = new ArrayList<>();

        li.add(10);
        li.add(20);
        li.add(30);
//        System.out.println(li);

        li.add(40); // it will add the given element to  the last index of the list
//        System.out.println(li);

        List<Integer> newLi = new ArrayList<>();

        newLi.add(100);
        newLi.add(200);

        li.addAll(newLi);
        System.out.println(li);

//        System.out.println(li.get(2)); // it will print the element of the given index

        li.remove(1); // it will remove the element of the given index
        System.out.println(li);

        li.remove(Integer.valueOf(30)); // it will remove the given element
        System.out.println(li);

//        li.clear();         // it will remove all the element from the list
//        System.out.println(li);

        // Time complexity: Big o(n)

        li.set(0, 1000);    // it will update the value of the given index
        System.out.println(li);     // it's time complexity: Big o(1)

//        System.out.println(li.contains(200));   // it will check whether the given element is present or not
                                                // it's time complexity is: Big o(n)

//        System.out.println(li.size());      // it will print the number of elements in the list

        System.out.println("For loop: ");
        for(int i = 0; i < li.size(); i++){
            System.out.println(li.get(i));
        }

        System.out.println("For each loop:");
        for(Integer ele : li){
            System.out.println(ele);
        }

        System.out.println("Iterator:");
        Iterator<Integer> it = li.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
