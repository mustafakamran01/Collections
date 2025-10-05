import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollectionsClass {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        list.add(new Student(2, "Mustafa"));
        list.add(new Student(4, "Kamran"));
        list.add(new Student(3, "Naaz"));
        list.add(new Student(1, "MK"));

//        Student s1 = new Student(2, "Mustafa");
//        Student s2 = new Student(3, "Kamran");
//        System.out.println(s1.compareTo(s2));

        System.out.println(list);

//        Collections.sort(list, ((o1, o2) -> o1.name.compareTo(o2.name)));

        System.out.println(list);










//        List<Integer> list = new ArrayList<>();
//
//        list.add(34);
//        list.add(12);
//        list.add(9);
//        list.add(9);
//        list.add(9);
//        list.add(76);
//        list.add(29);
//        list.add(75);
//
//        System.out.println("Min element: " + Collections.min(list));
//        System.out.println("Max element: " + Collections.max(list));
//        System.out.println(Collections.frequency(list, 9));
//        /*
//            It will give the number of times given element is present.
//         */
//
//        Collections.sort(list);
//        System.out.println(list);
//
//        Collections.sort(list, Comparator.reverseOrder());
//        /*
//        It will sort the given collection in reverse order.
//         */
//        System.out.println(list);
    }
}
