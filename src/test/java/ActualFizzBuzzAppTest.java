import FizzBuzzConvertor.fizzBuzzConvertor;
import org.junit.Test;

public class ActualFizzBuzzAppTest {
    @Test
    public void outputTheHundredFizzBuzzes(){
        fizzBuzzConvertor fizzBuzz = new fizzBuzzConvertor();
        for(int i = 1; i <= 100; i++){
            System.out.println(fizzBuzz.convert(i));
        }
    }
}
