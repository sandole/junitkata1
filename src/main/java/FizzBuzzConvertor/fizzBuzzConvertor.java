package FizzBuzzConvertor;

public class fizzBuzzConvertor {
    public String convert(int number) {

        if (isDivisibleByFifteen(number)) {
            return "FizzBuzz";
        }
        if (isDivisibleByThree(number)) {
            return "Fizz";
        }
        if (isDivisibleByFive(number)) {
            return "Buzz";
        }
        return Integer.toString(number);
    }

    public boolean isDivisibleByThree(int number) {
        return number % 3 == 0;
    }

    public boolean isDivisibleByFive(int number) {
        return number % 5 == 0;
    }

    public boolean isDivisibleByFifteen(int number) {
        return number % 15 == 0;
    }
}
