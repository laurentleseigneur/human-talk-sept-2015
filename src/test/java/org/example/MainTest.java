package org.example;

import org.junit.Test;

import static org.example.Main.main;

/**
 * @author laurentleseigneur
 */
public class MainTest {

    @Test
    public void should_do_the_job() throws Exception {
        //given
        final String[] validParams = {"HumanTalks", "Human Talks"};

        for (String param : validParams) {
            String[] args = {param};
            //when
            main(args);

            //then
            // how to check that the right message is displayed
        }

    }

    @Test
    public void should_raise_exception() throws Exception {
        //given
        String[] args = {"Human", "Talks"};

        //when
        main(args);

        //then
        //how to check exception is throned with the right message ???
    }

    @Test
    public void should_display_usage() throws Exception {
        //when
        main(null);

        //then
        //how to check usage is displayed ???
    }
}
