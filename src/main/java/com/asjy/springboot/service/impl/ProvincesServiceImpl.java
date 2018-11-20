package com.asjy.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asjy.springboot.dao.ProvincesMapper;
import com.asjy.springboot.model.Provinces;
import com.asjy.springboot.service.IProvincesService;

@Service
public class ProvincesServiceImpl implements IProvincesService{
	
	@Autowired 
	ProvincesMapper provincesMapper;

	public List<Provinces> findAll() {
		List<Provinces> list_provinces = provincesMapper.findAll();
		// TODO Auto-generated method stub
		return list_provinces;
	}

	

}
