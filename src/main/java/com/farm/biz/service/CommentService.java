package com.farm.biz.service;

import java.util.List;

import com.farm.biz.dto.ProductCommentVO;

public interface CommentService {

	int saveComment(ProductCommentVO vo);

	List<ProductCommentVO> listComment(int pseq);

	List<ProductCommentVO> getListComment(int pdseq);

}