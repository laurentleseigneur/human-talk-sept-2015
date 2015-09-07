package org.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.example.Main.main;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.ExpectedSystemExit;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.rules.ExpectedException;

/**
 * @author laurentleseigneur
 */
public class MainTest {

    @Rule
    public ExpectedSystemExit expectedSystemExit = ExpectedSystemExit.none();

    @Rule
    public SystemOutRule systemOutRule = new SystemOutRule().enableLog().muteForSuccessfulTests();

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void should_do_the_job() throws Exception {
        //given
        final String[] validParams = { "HumanTalks", "Human Talks" };

        for (String param : validParams) {
            String[] args = {param};
            //when
            main(args);

            //then
            assertThat(systemOutRule.getLog()).as("should log message").contains("Hello " + param + "!");
        }

    }

    @Test
    public void should_raise_exception() throws Exception {
        //given
        String[] args = { "Human", "Talks" };

        //then
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("too many parameters provided!");

        //when
        main(args);

    }

    @Test
    public void should_display_usage() throws Exception {
        //given
        expectedSystemExit.expectSystemExitWithStatus(1);

        //when
        main(null);

        //then
        assertThat(systemOutRule.getLog()).as("should log usage").isEqualTo("Usage: java -jar example.jar \"parameter\"");
    }
}
