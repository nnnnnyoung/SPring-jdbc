package com.human.service;

import java.util.List;

import com.human.VO.BoardVO;
import com.human.VO.PageVO;

public interface IF_boardService {
	public void insertOne(BoardVO boardvo) throws Exception; //��Ʈ�ѷ����� ȣ���� �޼���
	public List<BoardVO> selectAll(PageVO pageVO) throws Exception; //��Ʈ�ѷ����� ȣ���� �޼���
	// ���ǵ� �޼���� ��Ʈ�ѷ��� ȣ���ϴ� �޼����̴�..������ DAO�� ȣ���ϴ� �޼��尡 �������̴�. 	
	// �̸��� �����ϰ� ���� ������ ������ �����̴�. �������� ������Դϴ�. �׷��� ��Ʈ�ѷ� <> ���� <> DAO�� ���� �����ϰ�
	// �� ��ݿ��� �������� �����ؾ��մϴ�. �������� ���ٴ� �ǹ̸� ������ �� �ִ�
	public int countBoard() throws Exception;
	
}
