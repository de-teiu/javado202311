package com.example.demo.domain.mapper;

import com.example.demo.domain.model.UserMaster;
import com.example.demo.domain.model.UserMasterExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMasterMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.user_master
	 * @mbg.generated
	 */
	long countByExample(UserMasterExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.user_master
	 * @mbg.generated
	 */
	int deleteByExample(UserMasterExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.user_master
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.user_master
	 * @mbg.generated
	 */
	int insert(UserMaster row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.user_master
	 * @mbg.generated
	 */
	int insertSelective(UserMaster row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.user_master
	 * @mbg.generated
	 */
	List<UserMaster> selectByExample(UserMasterExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.user_master
	 * @mbg.generated
	 */
	UserMaster selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.user_master
	 * @mbg.generated
	 */
	int updateByExampleSelective(@Param("row") UserMaster row, @Param("example") UserMasterExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.user_master
	 * @mbg.generated
	 */
	int updateByExample(@Param("row") UserMaster row, @Param("example") UserMasterExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.user_master
	 * @mbg.generated
	 */
	int updateByPrimaryKeySelective(UserMaster row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.user_master
	 * @mbg.generated
	 */
	int updateByPrimaryKey(UserMaster row);
}