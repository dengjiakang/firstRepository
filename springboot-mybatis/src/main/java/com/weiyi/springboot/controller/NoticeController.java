/**
 * 
 */
package com.weiyi.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weiyi.springboot.pojo.Notice;
import com.weiyi.springboot.service.NoticeService;

/**
 * @类描述:兄弟，说点什么吧
 *
 * @创建人:Dengjk
 * @日期:2017年9月5日上午10:57:43
 * 
 */
@RestController
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	@GetMapping("/findAll")
	public List<Notice> findAll(){
		
		List<Notice> findAll = noticeService.findAll();
		
		return findAll;
		
	}
}