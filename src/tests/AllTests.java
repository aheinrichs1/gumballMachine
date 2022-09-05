package tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * @author alexh - aheinrichs
 * CIS175 - Fall 2022
 * Sep 4, 2022
 */
@RunWith(Suite.class)
@SuiteClasses({ TestGettersAndSetters.class, TestLogic.class, TestNotNull.class })
public class AllTests {

}
