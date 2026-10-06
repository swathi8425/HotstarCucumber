
package stepdefinitions;

import base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp() {

        System.out.println("===== Starting Scenario =====");

        BaseTest.setUp();
    }

    @After
    public void tearDown() {

        System.out.println("===== Ending Scenario =====");

        BaseTest.tearDown();
    }
}

