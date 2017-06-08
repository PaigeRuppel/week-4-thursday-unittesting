package fizzBuzz;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void shouldReturnOne() {
		// arrange
		FizzBuzz underTest = new FizzBuzz();
		// act
		String response = underTest.say(1);
		// assert
		Assert.assertEquals("should have responded '1'", "1", response);
	}

	@Test
	public void shouldReturnTwo() {
		// arrange
		FizzBuzz underTest = new FizzBuzz();
		// act
		String response = underTest.say(2);
		// assert (without message)
		Assert.assertEquals("2", response);

	}

	@Test
	public void shouldReturnFizzInsteadOf3() {
		// arrange
		FizzBuzz underTest = new FizzBuzz();
		// act
		String response = underTest.say(3);
		// assert
		Assert.assertEquals("Fizz", response);
	}

	@Test
	public void shouldReturnFizzInsteadOf6() {
		// arange
		FizzBuzz underTest = new FizzBuzz();
		// act
		String response = underTest.say(6);
		// assert
		Assert.assertEquals("Fizz", response);
	}
	
	@Test
	public void shouldReturnBuzzInsteadOf5() {
		// arange
		FizzBuzz underTest = new FizzBuzz();
		// act
		String response = underTest.say(5);
		// assert
		Assert.assertEquals("Buzz", response);
	}
	
	@Test
	public void shouldReturnBuzzInsteadOf10() {
		// arange
		FizzBuzz underTest = new FizzBuzz();
		// act
		String response = underTest.say(10);
		// assert
		Assert.assertEquals("Buzz", response);
	}
	
	@Test
	public void shouldReturnFizzBuzzInsteadOf15() {
		// arange
		FizzBuzz underTest = new FizzBuzz();
		// act
		String response = underTest.say(15);
		// assert
		Assert.assertEquals("FizzBuzz", response);
	}
	
	@Test
	public void shouldReturnFizzBuzzInsteadOf30() {
		// arange
		FizzBuzz underTest = new FizzBuzz();
		// act
		String response = underTest.say(30);
		// assert
		Assert.assertEquals("FizzBuzz", response);
	}

}
