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
    Job test_job_5;

    @Before
    public void testSetUp() {
        test_job_1 = new Job();
        test_job_2 = new Job();
        test_job_3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_job_4 = new Job("", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @Test
    public void testSettingJobID () {
        assertEquals(1, test_job_2.getId() - test_job_1.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields () {
        assertEquals(3, test_job_3.getId());
        assertEquals("Product tester", test_job_3.getName());
        assertEquals("ACME", test_job_3.getEmployer().getValue());
        assertEquals("Desert", test_job_3.getLocation().getValue());
        assertEquals("Quality control", test_job_3.getPositionType().getValue());
        assertEquals("Persistence", test_job_3.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality(){
        assertFalse(test_job_3.getId() == test_job_4.getId());
    }

    @Test
    public void testToString() {
        assertEquals("\n" + "ID: " + test_job_3.getId() + "\n" +
                        "Name: " + "Product tester" + "\n" +
                        "Employer: " + "ACME" + "\n" +
                        "Location: " + "Desert" + "\n" +
                        "Position Type: " + "Quality control" + "\n" +
                        "Core Competency: " + "Persistence" + "\n",
                test_job_3.toString());
        assertEquals("\n" + "ID: " + test_job_4.getId() + "\n" +
                "Name: " + "Data not available" + "\n" +
                "Employer: " + "ACME" + "\n" +
                "Location: " + "Desert" + "\n" +
                "Position Type: " + "Quality control" + "\n" +
                "Core Competency: " + "Persistence" + "\n",
                test_job_4.toString());
    }

}
