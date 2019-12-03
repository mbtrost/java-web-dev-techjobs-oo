package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertFalse;

public class JobTest {

    Job test_job_1;
    Job test_job_2;
    Job test_job_3;
    Job test_job_4;

    @Before
    public void testSetUp() {
        test_job_1 = new Job();
        test_job_2 = new Job();
        test_job_3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_job_4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    }

    @Test
    public void testSettingJobID () {
        assertEquals(1, test_job_2.getId() - test_job_1.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields () {
        assertEquals(test_job_3.getName(), "Product tester");
        assertEquals(test_job_3.getEmployer().getValue(), "ACME");
        assertEquals(test_job_3.getLocation().getValue(), "Desert");
        assertEquals(test_job_3.getPositionType().getValue(), "Quality control");
        assertEquals(test_job_3.getCoreCompetency().getValue(), "Persistence");
    }

    @Test
    public void testJobsForEquality(){
        assertFalse(test_job_3.getId() == test_job_4.getId());
    }

}
