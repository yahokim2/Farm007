package com.farm.biz.service;

import java.util.List;

import com.farm.biz.dto.QnaVO;

public interface QnaService {

	List<QnaVO> listQna(String id);

	QnaVO getQna(int qseq);

	void insertQna(QnaVO vo);

//	// 게시판 목록  #0522
//	List<QnaVO> listAllQna();
//
//	// 게시판 답변 처리  #0522
//	void updateQna(QnaVO vo);

	List<QnaVO> getListQna(String id);

}