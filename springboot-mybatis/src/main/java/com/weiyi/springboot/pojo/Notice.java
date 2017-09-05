/**
 * 
 */
package com.weiyi.springboot.pojo;

/**
 * @类描述:notice  pojo
 *
 * @创建人:Dengjk
 * @日期:2017年9月5日上午10:29:48
 * 
 */

public class Notice {
	
	private Long id;
	
	private String title;
	
	private String content;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
}
