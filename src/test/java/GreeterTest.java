import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GreeterTest {

    @Test
    public void should_send_greetings() {
        assertThat(Greeter.greet()).isEqualTo("Subject: Happy birthday!\n\n" +
                "Happy birthday, dear John!");
    }

}
