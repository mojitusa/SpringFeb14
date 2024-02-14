package org.ryuuzakiumi.service;

import java.util.List;
import java.util.Map;

import org.ryuuzakiumi.dao.MemberDAO;
import org.ryuuzakiumi.dto.MemberDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
	
	@Autowired
	private MemberDAO memberDAO;  //만들어 줘야 합니다.
	
	public List<MemberDTO> memberList(){   //만들어 줘야 합니다.
		return memberDAO.memberList();
	}

	public List<Map<String, Object>> memberList2() {
		
		return memberDAO.memberList2();
	}

}
