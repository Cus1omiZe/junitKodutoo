import org.junit.* ;
import static org.junit.Assert.* ;

public class SubscriptionTest {

   @Test
   public void test_returnEuro() {
      System.out.println("Test if pricePerMonth returns Euro...") ;
      Subscription S = new Subscription(200,2) ;
      assertEquals(1.0, S.pricePerMonth(), 0.01) ;
   }

   @Test
   public void test_roundUp() {
      System.out.println("Test if pricePerMonth rounds up correctly...") ;
      Subscription S = new Subscription(200, 3);
      assertEquals(0.67, S.pricePerMonth(), 0.01) ;

   }
}
//
//java -cp junit-4.12.jar;hamcrest-core-1.3.jar;. org.junit.runner.JUnitCore SubscriptionTest