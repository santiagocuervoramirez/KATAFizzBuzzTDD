import java.util.Arrays;

public class FizzBuzz {

    private String value(int number) {
        if (isFizzBuzz(number)) {
            return "FizzBuzz";
        }

        if (isFizz(number)) {
            return "Fizz";
        }

        if (isBuzz(number)) {
            return "Buzz";
        }
        return String.valueOf(number);
    }

    private boolean isFizzBuzz(int number) {
        return isFizz(number) && isBuzz(number);
    }

    private boolean isBuzz(int number) {
        return number % 5 == 0;
    }

    private boolean isFizz(int number) {
        return number % 3 == 0;
    }

    public String[] values() {
        String[] values = new String[100];
        for (int index = 0; index < 100; index ++) {
            values[index] = value(index+1);
        }
        return values;
    }
}
