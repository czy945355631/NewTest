package com.asjy.springboot.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asjy.springboot.model.Provinces;
import com.asjy.springboot.service.IProvincesService;

@RestController
public class TextController {
	@Autowired
	IProvincesService provincesService;
		@RequestMapping("/findProvinces")
		public Map<String, Object> findProvinces(){
			Map<String, Object> result = new HashMap<String,Object>();
			List<Provinces> findAll = provincesService.findAll();
			result.put("provinces", findAll);
			return result;
		}
}
