package kata_54b724efac3d5402db00065e;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class MorseCodeDecoderTest {
    @Test
    public void testExampleFromDescription() {
      Assert.assertThat(MorseCodeDecoder.decode("   .... . -.--   .--- ..- -.. ."), CoreMatchers.is("HEY JUDE"));
    }
}