package com.demo.sw;

import javax.inject.Inject;

import org.apache.log4j.xml.DOMConfigurator;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.demo.persistence.MemberDAO;
import org.apache.logging.log4j.core.config.Configurator;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/*.xml"})
public class MemberDAOTest {
	@Inject
	private MemberDAO dao;
	@Before
	public void setUp() {
		Configurator.initialize("Log4j2", "src/test/resources/log4j2.xml");
		//DOMConfigurator.configure("src/test/resources/log4j.xml");
	}
	@Test
	public void test() {
		System.out.println(dao);
	}
	@Test
	public void test2() {
		System.out.println(dao.getTime());
	}
}
