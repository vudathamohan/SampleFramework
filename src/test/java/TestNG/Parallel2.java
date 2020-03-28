package TestNG;

import org.testng.annotations.Test;

public class Parallel2 {
	  @Test
	  public void testcase4() {
		  long id4=Thread.currentThread().getId();
		  System.out.println("test case 4success"+"-->"+id4);
		  }
	  @Test
	  public void testcase5() {
		  long id5=Thread.currentThread().getId();
		  System.out.println("test case 5success"+"-->"+id5);
		  }
	  @Test
	  public void testcase6() {
		  long id6=Thread.currentThread().getId();
		  System.out.println("test case 6success"+"-->"+id6);
		  }
	}