package com.farm.biz.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.farm.biz.dto.ProductVO;

import utils.Criteria;

@Repository
public class ProductDAO  {

	@Autowired
	SqlSessionTemplate mybatis;		//  MyBatis는 데이터베이스 연동 작업을 보다 쉽고 간편하게 수행할 수 있도록 도와주는 프레임워크 임.

	// 신상품 목록 얻어오기
	public List<ProductVO> getNewProductList() {

		return mybatis.selectList("ProductMapper.getNewProductList");
	}
	// 베스트 상품 목록 얻어오기
	public List<ProductVO> getBestProductList() {

		return mybatis.selectList("ProductMapper.getBestProductList");
	}
	// 상품번호로 하나의 상품정보 얻어오기
	public ProductVO getProduct(ProductVO vo) {

		return mybatis.selectOne("ProductMapper.getProduct", vo);
	}
	// 상품 종류별 상품 목록 얻어오기 (????)
	public List<ProductVO> getProductListByKind(String kind) {

		return mybatis.selectList("ProductMapper.getProductListByKind", kind);
	}


}
