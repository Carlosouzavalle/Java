package Set;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Usser> users = new HashSet<>();
        users.add(new Usser(1, "Carlos"));
        users.add(new Usser(2, "Camila"));
        users.add(new Usser(3, "Patricia"));
        users.add(new Usser(4, "Lorena"));
        users.add(new Usser(5, "Lorena"));

        System.out.println(new Usser(1, "Carlos").hashCode());

        System.out.println(users.contains(new Usser(1, "Carlos")));

        // users.forEach(System.out::println);


        // var iterator = users.iterator();
        // while (iterator.hasNext()) {
        //     System.out.println(iterator.next());
        // }
    
    }
}
