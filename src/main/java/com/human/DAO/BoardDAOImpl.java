package com.human.DAO;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.human.VO.BoardVO;
@Repository //dao������ �˷��ش�. 
public class BoardDAOImpl implements IF_boardDAO{
	private static String mapperQuery="com.human.DAO.IF_boardDAO"; //�����������̽� ��� ����
	
	//mybatis�� sqlSession ��ü�� �ʿ��մϴ�
	@Inject //�����̳ʿ��� �����;��Ѵ�. �����̳ʿ��� �ڷ����� �´� ��ü�� �ּҸ� �������ش�.
	private SqlSession sqlSession; //sqlSession Ÿ���� ��ü�� ������ �����̳ʿ� �ִ�.
									// ���⼭ �� ��ü�� �ʿ��ϴ�. �׷��� �����̳ʿ��� �����;��Ѵ�.
	
	@Override
	public void insertOne(BoardVO boardvo) throws Exception{
		sqlSession.insert(mapperQuery+".insertOne", boardvo); // ������ ���� �� �����Ѵ�.
				//insert  //��������          //id			//parameter
	}
	

}
