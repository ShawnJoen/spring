package com.demo.sw;

import org.apache.log4j.xml.DOMConfigurator;
import org.apache.logging.log4j.core.config.Configurator;
import org.junit.Before;
import org.junit.Test;

import javax.inject.Inject;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
@WebAppConfiguration
public class ControllerTest {

	@Inject
	private WebApplicationContext context;
	
	private MockMvc mockMVC;
	private static final Logger logger = LoggerFactory.getLogger(ControllerTest.class);
	
	@Before
	public void setUp() {
		Configurator.initialize("Log4j2", "src/test/resources/log4j2.xml");
		//DOMConfigurator.configure("src/test/resources/log4j.xml");
		mockMVC = MockMvcBuilders.webAppContextSetup(context).build();
	}

	@Test
	public void test() throws Exception {
		mockMVC.perform(MockMvcRequestBuilders.get("/doA"));
	}
}
