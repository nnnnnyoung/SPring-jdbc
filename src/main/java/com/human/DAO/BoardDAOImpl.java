package com.human.DAO;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.human.VO.BoardVO;
@Repository //dao단임을 알려준다. 
public class BoardDAOImpl implements IF_boardDAO{
	private static String mapperQuery="com.human.DAO.IF_boardDAO"; //매핑인터페이스 경로 설정
	
	//mybatis의 sqlSession 객체가 필요합니다
	@Inject //컨테이너에서 가져와야한다. 컨테이너에서 자료형과 맞는 객체의 주소를 주입해준다.
	private SqlSession sqlSession; //sqlSession 타입의 객체는 스프링 컨테이너에 있다.
									// 여기서 이 객체가 필요하다. 그런데 컨테이너에서 가져와야한다.
	
	@Override
	public void insertOne(BoardVO boardvo) throws Exception{
		sqlSession.insert(mapperQuery+".insertOne", boardvo); // 쿼리를 매핑 및 실행한다.
				//insert  //매핑정보          //id			//parameter
	}
	

}
