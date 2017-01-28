package com.demo.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

import org.springframework.stereotype.Repository;
@Repository()
public class memberDAOImpl implements MemberDAO {
	@Inject
	private SqlSession sqlSession;
	@Override
	public String getTime() {
		return sqlSession.selectOne("com.demo.mapper.MemberMapper.getTime");
	}
}
