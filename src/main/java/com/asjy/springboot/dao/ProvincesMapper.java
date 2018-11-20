package com.asjy.springboot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.asjy.springboot.model.Cities;
import com.asjy.springboot.model.Prefectures;
import com.asjy.springboot.model.Provinces;

@Mapper
public interface ProvincesMapper {
	@Results(id="getPrefecturesByCitiesId",value = {
			@Result(column = "InternalID", property = "internalID"),
			@Result(column = "prefectureName", property = "prefectureName"),
			@Result(column = "CityInternalID", property = "cityInternalID")
	})
	@Select("select InternalID,prefectureName,CityInternalID from Prefectures where CityInternalID = #{CityInternalID}")
	List<Prefectures> getPrefecturesByCitiesId(@Param(value="CityInternalID")String CityInternalID);
	
	@Results(id="getCityByProvincesId",value = {
			@Result(column = "InternalID" , property = "internalID"),
			@Result(column = "CityName" , property = "cityName"),
			@Result(column = "provinceInternalID" , property = "provinceInternalID")
			,
			@Result(column = "InternalID" , property = "prefectures",
			many=@Many(select = "com.asjy.springboot.dao.ProvincesMapper.getPrefecturesByCitiesId")
					)
			})
	
	@Select("select InternalID,CityName,ProvinceInternalID from cities where ProvinceInternalID = #{id}")
	List<Cities> getCityByProvincesId(String id);
	
	@Results(id="findAll",value = {
			@Result(column = "InternalID" , property = "internalID",id=true),
			@Result(column = "ProvinceName" , property = "provinceName"),
			@Result(column = "InternalID" , property = "Cities",
			many=@Many(select = "com.asjy.springboot.dao.ProvincesMapper.getCityByProvincesId")
					)
			})
	@Select("select InternalID,ProvinceName from provinces")
	List<Provinces> findAll();
}
