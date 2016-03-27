import injector.MessageServiceInjector;
import org.junit.Test;
import service.APNservice;
import service.EmailService;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static com.google.common.truth.Truth.assert_;

public class ApplicationTest {

    @Test
    public void consoleTestForSendEmailMessage() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));

        MessageServiceInjector messageServiceInjector = new MessageServiceInjector(new EmailService());
        messageServiceInjector.processMessage("Email has been send");

        String output = new String(baos.toByteArray());
        assert_().that(output.contains("Email has been send"));
    }

    @Test
    public void consoleTestForSendAPNMessage() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));

        MessageServiceInjector messageServiceInjector = new MessageServiceInjector(new APNservice());
        messageServiceInjector.processMessage("APN has been send");

        String output = new String(baos.toByteArray());
        assert_().that(output.contains("APN has been send"));
    }

}