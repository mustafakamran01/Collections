import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
    public static void main(String[] args) {

//        Set<Integer> set = new TreeSet<>();
//        /*
//            It sorts all the element present in it.
//            Time complexity: Big Olog(n)
//         */
//
////        Set<Integer> set = new LinkedHashSet<>();
//        /*
//            It maintains the insertion order
//         */
//
////        Set<Integer> set = new HashSet<>();
//        /*
//            set contains only unique values.
//            It store values on the basis of hashing.
//            It does not maintain insertion order.
//            Time complexity: Big o(1)
//         */
//
//        set.add(32);
//        set.add(2);
//        set.add(54);
//        set.add(21);
//        set.add(65);
//
//        System.out.println(set);
//
//        set.remove(2); // it will remove the given element from set
//
//        System.out.println(set);
//
//        System.out.println(set.contains(22));
//
//        System.out.println(set.isEmpty());
//
//        System.out.println(set.size());

        Set<Student> student = new HashSet<>();

        student.add(new Student(19, "Mustafa"));
        student.add(new Student(23, "Kamran"));
        student.add(new Student(30, "Naaz"));
        student.add(new Student(19, "Mustafa"));

        System.out.println(student);
    }
}
