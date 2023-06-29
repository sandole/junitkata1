import FizzBuzzConvertor.fizzBuzzConvertor;
import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    // Comments

    @Test
    public void fizzBuzzConvertorLeavesNormalNumbersAlone(){
        fizzBuzzConvertor fizzBuzz = new fizzBuzzConvertor();

        Assert.assertEquals("1", fizzBuzz.convert(1));
        Assert.assertEquals("7", fizzBuzz.convert(7));
    }

    @Test
    public void fizzBuzzConvertorMultiplesOfThree(){
        fizzBuzzConvertor fizzBuzz = new fizzBuzzConvertor();

        Assert.assertEquals("Fizz",fizzBuzz.convert(3));
        Assert.assertEquals("Fizz",fizzBuzz.convert(6));
    }

    @Test
    public void fizzBuzzConvertorMultiplesOfFive(){
        fizzBuzzConvertor fizzBuzz = new fizzBuzzConvertor();

        Assert.assertEquals("Buzz",fizzBuzz.convert(5));
        Assert.assertEquals("Buzz",fizzBuzz.convert(10));
    }

    @Test
    public void fizzBuzzConvertorMultiplesOfThreeAndFive(){
        fizzBuzzConvertor fizzBuzz = new fizzBuzzConvertor();

        Assert.assertEquals("FizzBuzz",fizzBuzz.convert(15));
        Assert.assertEquals("FizzBuzz",fizzBuzz.convert(30));
    }
}