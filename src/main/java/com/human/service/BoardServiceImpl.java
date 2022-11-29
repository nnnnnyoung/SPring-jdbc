package com.human.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Repository;

import com.human.DAO.IF_boardDAO;
import com.human.VO.BoardVO;
import com.human.VO.PageVO;
@Repository
public class BoardServiceImpl implements IF_boardService{
	
	
	@Inject
	private IF_boardDAO boarddao; 
	@Override
	public void insertOne(BoardVO boardvo) throws Exception {
		
		boarddao.insertOne(boardvo);
	}
	@Override
	public List<BoardVO> selectAll(PageVO pageVO) throws Exception {
		// TODO Auto-generated method stub
		return boarddao.selectAll(pageVO);
	}
	@Override
	public int countBoard() throws Exception {
		// TODO Auto-generated method stub
		return boarddao.countBoard();
	}
	
}
