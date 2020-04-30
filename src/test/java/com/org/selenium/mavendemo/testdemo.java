package com.org.selenium.mavendemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testdemo 
{
@BeforeSuite
public void beforesuit()
{
System.out.println("BeforeSuite");	
}
@AfterSuite 
public void aftersuit()
{
System.out.println("AfterSuite");	
}
@BeforeTest
public void beforetest()
{
System.out.println("BeforeTest");	
}
@AfterTest
public void aftertest()
{
System.out.println("AfterTest");		
}
@BeforeClass
public void beforeclass()
{
System.out.println("BeforeClass");	
}
@AfterClass
public void afterclass()
{
System.out.println("AfterClass");	
}
@BeforeMethod
public void beforemethod()
{
System.out.println("BeforeMethod");	
}
@AfterMethod
public void aftermethod()
{
System.out.println("AfterMethod");	
}
@Test(priority=3)
public void test1()
{
System.out.println("Test1");	
}
@Test(priority=2)
public void test2()
{
System.out.println("Test2");	
}
@Test(priority=1,enabled=false)
public void test3()
{
System.out.println("Test3");	
}
@Test(priority=4)
public void test4()
{
System.out.println("Test4");	
}
}
