package com.farm.biz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farm.biz.dao.ProductDAO;
import com.farm.biz.dto.ProductVO;

import utils.Criteria;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDAO productDao;
	
	@Override
	public List<ProductVO> getNewProductList() {
		
		return productDao.getNewProductList();
	}

	@Override
	public List<ProductVO> getBestProductList() {
		
		return productDao.getBestProductList();
	}

	@Override
	public ProductVO getProduct(ProductVO vo) {
		
		return productDao.getProduct(vo);
	}

	@Override
	public List<ProductVO> getProductListByKind(String kind) {
		
		return productDao.getProductListByKind(kind);
	}


}
