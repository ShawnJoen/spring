package com.demo.sw;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;

import com.demo.persistence.MemberDAO;

@RunWith(JUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/*.xml"})
public class MemberDAOTest {
	@Inject
	private MemberDAO dao;
	@Test
	public void test() {
		System.out.println(dao);
	}
	@Test
	public void test2() {
		System.out.println(dao.getTime());
	}
}
