package com.demo.sw;

import org.junit.runners.model.InitializationError;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.apache.log4j.xml.DOMConfigurator;

public class JUnit4ClassRunner extends SpringJUnit4ClassRunner {  
	static {  
		DOMConfigurator.configure("src/test/resources/log4j.xml");
    }
      
    public JUnit4ClassRunner(Class<?> clazz) throws InitializationError {  
        super(clazz);  
    }  
}
