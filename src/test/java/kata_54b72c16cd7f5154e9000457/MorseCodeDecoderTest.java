package kata_54b72c16cd7f5154e9000457;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class MorseCodeDecoderTest {
    @Test
    public void testExampleFromDescription() throws Exception {
        Assert.assertThat(MorseCodeDecoder.decodeMorse(MorseCodeDecoder.decodeBits("1100110011001100000011000000111111001100111111001111110000000000000011001111110011111100111111000000110011001111110000001111110011001100000011")), CoreMatchers.is("HEY JUDE"));
    }
}
