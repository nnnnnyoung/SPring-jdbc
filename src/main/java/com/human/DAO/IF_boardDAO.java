package com.human.DAO;

import java.util.List;

import com.human.VO.BoardVO;

public interface IF_boardDAO {
	public void insertOne(BoardVO boardvo) throws Exception; //���񽺴ܿ��� ȣ���� �޼���+���ο� ���� �޼���
	
	public List<BoardVO> selectAll() throws Exception;


}


