package com.human.service;

import javax.inject.Inject;

import org.springframework.stereotype.Repository;

import com.human.DAO.IF_boardDAO;
import com.human.VO.BoardVO;
@Repository
public class BoardServiceImpl implements IF_boardService{
	
	
	@Inject
	private IF_boardDAO boarddao; 
	@Override
	public void insertOne(BoardVO boardvo) throws Exception {
		
		boarddao.insertOne(boardvo);
	}
	
}
