package TestNG;



import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest2 {
@Test(priority=1,dependsOnMethods={"TestB"},alwaysRun=true)
public void TestC() {
Assert.assertEquals("google","google" );
}
@Test(priority=2,description="yahoo",invocationCount = 7,invocationTimeOut = 3000 )
public void TestB() {
Assert.assertEquals("yahoo1","yahoo" );
}
@Test(priority=3)
public void TestA() {
Assert.assertEquals("yahoo","yahoo" );
}
}