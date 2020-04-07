import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void decoder() {
        String expected="expected result: 123 123 456 7890-=";
        byte[] bytes=Main.coder(expected);

        String str=Main.decoder(bytes);
        Assert.assertEquals(expected,str);
    }
}