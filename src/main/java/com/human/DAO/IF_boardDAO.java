package com.human.DAO;

import java.util.List;

import com.human.VO.BoardVO;
import com.human.VO.PageVO;

public interface IF_boardDAO {
	public void insertOne(BoardVO boardvo) throws Exception; //���񽺴ܿ��� ȣ���� �޼���+���ο� ���� �޼���
	
	public List<BoardVO> selectAll(PageVO pageVO) throws Exception;
	public int countBoard() throws Exception;

}


