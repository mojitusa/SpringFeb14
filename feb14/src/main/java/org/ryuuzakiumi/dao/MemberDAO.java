package org.ryuuzakiumi.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.ryuuzakiumi.dto.MemberDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {
	
	@Autowired
	private SqlSession sqlSession; //생성
	
	public List<MemberDTO> memberList() {
		
		return sqlSession.selectList("member.memberList");
									//namespace    id
	}

	public List<Map<String, Object>> memberList2() {
		
		return sqlSession.selectList("member.memberList2");
	}

}
