import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class ApplicationTest {

    @Test
    public void should_send_a_birtday_greetings_message() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(output);
        System.setOut(out);

        Application.main(new String[]{""});

        assertThat(output.toString()).isEqualTo(
                String.format("Subject: Happy birthday!\n\n" +
                        "Happy birthday, dear %s!", "John"));
    }
}
