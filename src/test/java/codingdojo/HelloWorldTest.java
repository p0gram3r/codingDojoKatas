package codingdojo;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class HelloWorldTest {

    private CombinationValidator validator;
    private Combination secretCombination;

    @Before
    public void setup() {
        secretCombination = new Combination();
        validator = new CombinationValidator(secretCombination);
    }

    @Test
    public void testGetSecretCombination() {
        assertThat(validator.getSecretCombination(), is(secretCombination));
    }

}
