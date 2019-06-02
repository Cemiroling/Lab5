import junit.framework.Assert;
import org.junit.Test;

import static com.company.Amount.CombinationAmount;

public class AmountTest {
    @Test
    public void Amount(){
        long result = CombinationAmount(10);
        Assert.assertEquals(9, result);
        result = CombinationAmount(-100);
        Assert.assertEquals(-1, result);
    }
}
