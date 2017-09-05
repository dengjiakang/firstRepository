/**
 * 
 */
package com.weiyi.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.weiyi.springboot.pojo.Notice;

/**
 * @类描述:mapper映射接口
 *
 * @创建人:Dengjk
 * @日期:2017年9月5日上午10:51:22
 * 
 */

@Mapper
public interface NoticeMapper {
	
	@Select("select * from notice")
	List<Notice> findAll();
	
	Long count();
	
	List<Notice> findByPage(@Param("start")Integer start,@Param("size")Integer size);
	
}
