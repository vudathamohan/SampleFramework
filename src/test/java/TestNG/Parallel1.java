package TestNG;

import org.testng.annotations.Test;

public class Parallel1 {
  @Test
  public void testcase1() {
	  long id1=Thread.currentThread().getId();
	  System.out.println("test case 1success"+"-->"+id1);
	  }
  @Test
  public void testcase2() {
	  long id2=Thread.currentThread().getId();
	  System.out.println("test case 2success"+"-->"+id2);
	  }
  @Test
  public void testcase3() {
	  long id3=Thread.currentThread().getId();
	  System.out.println("test case 3success"+"-->"+id3);
	  }
}
