package com.human.service;

import java.util.List;

import com.human.VO.BoardVO;

public interface IF_boardService {
	public void insertOne(BoardVO boardvo) throws Exception; //��Ʈ�ѷ����� ȣ���� �޼���
	public List<BoardVO> selectAll() throws Exception; //��Ʈ�ѷ����� ȣ���� �޼���
	// ���ǵ� �޼���� ��Ʈ�ѷ��� ȣ���ϴ� �޼����̴�..������ DAO�� ȣ���ϴ� �޼��尡 �������̴�. 	
	// �̸��� �����ϰ� ���� ������ ������ �����̴�. �������� ������Դϴ�. �׷��� ��Ʈ�ѷ� <> ���� <> DAO�� ���� �����ϰ�
	// �� ��ݿ��� �������� �����ؾ��մϴ�. �������� ���ٴ� �ǹ̸� ������ �� �ִ�
}
