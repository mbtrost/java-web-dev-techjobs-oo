package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static junit.framework.TestCase.assertEquals;

public class JobTest {

    Job test_job_1;
    Job test_job_2;

    @Before
        public void createJobObject(){
        Job test_job_1 = new Job();
        Job test_job_2 = new Job();
    }

    @Test
    public void testSettingJobID() {
        assertEquals(test_job_1.getId(), test_job_2.getId(), 1);

    }

}
