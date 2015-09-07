package org.example;

import static org.example.Main.main;

import org.junit.Test;

/**
 * @author laurentleseigneur
 */
public class MainTest {

    @Test
    public void should_do_the_job() throws Exception {
        //given
        String[] args = { "HumanTalks" };

        //when
        main(args);

        //then
        //...how to check result ???

    }

    @Test
    public void should_also_do_the_job() throws Exception {
        //given
        String[] args = { "Human Talks" };

        //when
        main(args);

        //then
        //...how to check result ???

    }

    @Test(expected = IllegalArgumentException.class)
    public void should_raise_exception() throws Exception {
        //given
        String[] args = { "Human", "Talks" };

        //when
        main(args);

        //then
        //...how to check error message contains "too many parameters provided!" ???

    }

    @Test
    public void should_not_do_the_job_with_null_parameter() throws Exception {
        //when
        main(null);

        //then
        //...how to check result ???

    }

    @Test
    public void should_display_usage() throws Exception {
        //when
        main(null);

        //then
        //...how to assert usage is printed ???

    }
}
