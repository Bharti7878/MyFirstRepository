package softAsserts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertDrawBack {
  @Test
  public void testing() {
  
	  String a="abc";
	  String b="abc";
	  String c="abc1";
	  
	  Assert.assertEquals(a,b,"a and b are not equal TC is failed");
      Assert.assertEquals(a,c,"a and c are not equal TC is failed" );
      Assert.assertEquals(b,"b is not null TC is Failed");
  }
}
