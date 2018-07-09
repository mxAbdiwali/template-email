import static org.junit.Assert.*;

import org.junit.Test;

public class TestTemplate {
	/*
	Evaluating template “Hello, ${name}” with the value “Reader” for variable
	“name” results in the string “Hello, Reader”.
	*/

	@Test
	public void oneVariable() throws Exception {
		 Template template = new Template("Hello, ${name}");
		 template.set("name","Reader");
		 assertEquals("Hello, Reader", template.evaluate());
		 
	}

	
	@Test
	public void differentValue() throws Exception {
		 Template template = new Template("Hello, ${name}");
		 template.set("name","someone else");
		 assertEquals("Hello, someone else", template.evaluate());
		 
	}
	
	
	@Test
	public void differentVariable() throws Exception {
		 Template template = new Template("Hi, ${name}");
		 template.set("name","someone else");
		 assertEquals("Hi, someone else", template.evaluate());	 
	}
	
	@Test
	public void mulitipleVariable() throws Exception {
		 Template template = new Template("${one}, ${two}, ${three}");
		 template.set("one","1");
		 template.set("two", "2");
		 template.set("three", "3");
		 assertEquals("1, 2, 3", template.evaluate());	 
	}
}
