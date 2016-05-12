package snakecamel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class Test0 {

	//@Test
	//public void test() {
		//fail("Not yet implemented");
	//}
	

	@Test
	public void ノーマルスネーク() {
		SnakeCamelUtil SC = new SnakeCamelUtil();
		String expected = "AbcDef";
		String actual = SC.snakeToCamelcase("abc_def");
		assertThat(actual,is(expected));
		
	}
	
	@Test
	public void ノーマルキャメル() {
		SnakeCamelUtil SC = new SnakeCamelUtil();
		String expected = "abc_def";
		String actual = SC.camelToSnakecase("AbcDef");
		assertThat(actual,is(expected));
		
	}
	
	

}
