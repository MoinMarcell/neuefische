package fizzbuzz;

public class FizzBuzzMain {

    public static String fizzBuzz(int number){
        String s = String.valueOf(number);

        if(number % 3 == 0){
            s = "fizz";
        }
        if(number % 5 == 0){
            s = "buzz";
        }
        if(number % 3 == 0 && number % 5 == 0){
            s = "fizzbuzz";
        }

        return s;
    }

}
