package org.dubbo.consomer;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.dubbo.model.User;
import org.dubbo.provider.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext-consumer.xml");
		context.start();
		DemoService demoService = (DemoService)context.getBean("demoService");
		String result = demoService.sayHello("world!");
		System.out.println(result);
		
		System.out.println("-------------------------------------------------");
		List resultList = demoService.getUsers();
		for (int i = 0; i < resultList.size(); i++) {
			User user = (User)resultList.get(i);
			System.out.println(user.toString());
		}
		System.in.read();
	}
}
