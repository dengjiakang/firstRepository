/**
 * 
 */
package com.weiyi.springboot.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weiyi.springboot.mapper.NoticeMapper;
import com.weiyi.springboot.pojo.Notice;
import com.weiyi.springboot.service.NoticeService;

/**
 * @类描述:兄弟，说点什么吧
 *
 * @创建人:Dengjk
 * @日期:2017年9月5日上午10:56:01
 * 
 */

@Service
public class NoticeServiceImpl implements NoticeService{
	
	@Autowired
	private NoticeMapper noticeMapper;
	
	@Override
	public List<Notice> findAll() {
		
		return noticeMapper.findAll();
	}

}
