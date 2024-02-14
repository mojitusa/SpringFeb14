package org.ryuuzakiumi.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAO {

	@Autowired
	private SqlSession sqlSession;

	public List<Map<String, Object>> boardList() {
		return sqlSession.selectList("board.boardList");
	}

	public List<Map<String, Object>> boardList2(){
		List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("board_no", 1);
		map.put("board_title", "첫 번째 글");
		map.put("board_write", "홍길동");
		map.put("board_date", "2024-02-01");
		map.put("board_count", 0);
		list.add(map);
		
		map.put("board_no", 2);
		map.put("board_title", "두 번째 글");
		map.put("board_write", "김길동");
		map.put("board_date", "2024-02-02");
		map.put("Board_count", 1);
		list.add(map);
		
		return list;

	}

	public Map<String, Object> detail(String no) {
		return sqlSession.selectOne("board.detail", no);
	}
}
