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
        String[] args = {"HumanTalks"};

        //when
        main(args);

        //then
        //...how to check result ???

    }

    @Test
    public void should_also_do_the_job() throws Exception {
        //given
        String[] args = {"Human Talks"};

        //when
        main(args);

        //then
        //...how to check result ???

    }


    @Test
    public void should_not_do_the_job_with_null_parameter() throws Exception {
        //when
        main(null);

        //then
        //...how to check result ???

    }

    @Test
    public void should_not_do_the_job_with_empty_parameter() throws Exception {
        //given
        String[] args = {};

        //when
        main(null);

        //then
        //...how to check result ???

    }
}