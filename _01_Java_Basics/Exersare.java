import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;



public class Exersare {
    public static void main (String... args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int sum = a + b;
        int prod = a * b;
        System.out.println(a + " + " + b + " = " + sum);
        
         double f = Double.parseDouble(args[0]);
        f = Math.toRadians(f);
        System.out.println("Math.sin(" + f + ") = " + Math.sin(f));

        int[] numbers = {1,2,3,4,5};
        for(int num : numbers) {
            System.out.println("Number: " + num);
        }

        List<String> names = new ArrayList<>();
        names.add("Alin");
        names.add("Maria");
        names.add("Cosmina");

        Iterator<String> iterator = names.iterator();
        while(iterator.hasNext()) {
            String name = iterator.next();
            System.out.println("Name: " + name);
        }

        List<Integer> numbersList = Arrays.asList(1,2,3,4);
        numbersList.stream().forEach(num -> System.out.println("Number: " + num));

        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.forEach(color -> System.out.println("Color: " + color));
    }

}
