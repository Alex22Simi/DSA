package _01_Java_Basics;

//import java.util.stream.IntStream;

// Please solve the FizzBuzz :
// The program should iterate from 1 to 100 and print 
// 'Fizz' for multiples of 3, 'Buzz' for multiples of 5,
// 'FizzBuzz' for multiples of both 3 and 5,
//  and the number itself for all other cases.“

//Rezolvarea de pe LeetCode
// class FizzBuzz {
//     public List<String> fizzBuzz(int n) {
//          List<String> answer = new ArrayList<>();

//         for (int i = 1; i <= n; i++) {
//             if (i % 3 == 0 && i % 5 == 0) {
//                 answer.add("FizzBuzz");
//             } else if (i % 3 == 0) {
//                 answer.add("Fizz");
//             } else if (i % 5 == 0) {
//                 answer.add("Buzz");
//             } else {
//                 answer.add(String.valueOf(i));
//             }
//         }

//         return answer;
//     }
// }

public class FizzBuzz {
    public static void calculate() {
        for(int i = 1; i<= 100; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if(i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    //tip de problema rezolvat cu stream
    //nu este recomandata!!
    // public static void calculateWithStream() {
    //     IntStream.range(1, 100)
    //                 .mapToObj(number ->
    //                  (number % 15 == 0) ? "FizzBuzz" 
    //                  : (number % 3 == 0) ? "Fizz" 
    //                  : (number % 5 == 0) ?  "Buzz" 
    //                  : String.valueOf(number))
    //                  .forEach(System.out::println);
    // }

    public static void main(String[] args) {
        FizzBuzz.calculate();
        //FizzBuzz.calculateWithStream();

    }
}




