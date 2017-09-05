/**
 * 
 */
package com.weiyi.springboot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.weiyi.springboot.pojo.Notice;

/**
 * @类描述:兄弟，说点什么吧
 *
 * @创建人:Dengjk
 * @日期:2017年9月5日上午10:55:15
 * 
 */
public interface NoticeService {
	
	List<Notice> findAll();
}
