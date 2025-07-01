import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class ExtractEachTest{

	@Test
	public static void testWithExtract(){
	ExtractEach extract = new ExtractEach();
	
	String numbers = "12345";
	//int number = Integer.parseInt(numbers); 
	int check = 15; 
	
	assertEquals(check,extract.extractSum(numbers));


	}

}