package com.testcases;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
//Jsuite tester
@RunWith(Suite.class)
@SuiteClasses({ PlayerTest.class, TestConnection.class, TestManager.class, TestManSal.class, testPlayerSalary.class })
public class AllTests {

}
