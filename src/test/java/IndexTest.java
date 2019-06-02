import junit.framework.Assert;
import org.junit.Test;

import static com.company.Index.ShowIndex;

public class IndexTest {
    @Test
    public void Index(){
        int result = ShowIndex(100);
        Assert.assertEquals(600, result);
        result = ShowIndex(-400);
        Assert.assertEquals(100, result);
        result = ShowIndex(-4002);
        Assert.assertEquals(-1, result);
    }
}