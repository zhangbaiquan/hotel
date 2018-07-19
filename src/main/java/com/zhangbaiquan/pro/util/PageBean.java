package com.zhangbaiquan.pro.util;

import java.io.Serializable;
import java.util.List;

/**
 * 分页组件类
 * 
 * @ClassName: PageBean
 * @Description: 分页组件类
 * @author ZhangBaiQuan
 * @date 2018年3月3日 下午3:48:04
 *
 */
public class PageBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer totalRows; // 总记录数
	private Integer totalPages; // 总页数
	private Integer currentPage = 1; // 当前页
	private Integer pageSize = 5; // 每页显示数
	private List<?> list; // 每页显示的信息

	public Integer getTotalRows() {
		return totalRows;
	}

	public void setTotalRows(Integer totalRows) {
		this.totalRows = totalRows;
	}

	public Integer getTotalPages() {
		return totalPages = (int) Math.ceil(totalRows / (double) pageSize);
	}

	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}

	public Integer getCurrentPage() {
		return currentPage < 1 ? 1 : currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<?> getList() {
		return list;
	}

	public void setList(List<?> list) {
		this.list = list;
	}

	public PageBean() {

	}

	public PageBean(Integer totalRows, Integer currentPage, Integer pageSize) {
		this.totalRows = totalRows;
		this.currentPage = currentPage;
		this.pageSize = pageSize;
	}
	/**
	 * 定义首页方法
	* @Title: getFirstPage 
	* @param @return
	* @return int
	* @throws
	 */
	public int getFirstPage(){
		return 1;
	}
	public int getStartPos() {
		return (this.getCurrentPage()-1)*this.pageSize;
	}

	
	/**
	 * 定义尾页的方法
	* @Title: getLastPage 
	* @param @return
	* @return int
	* @throws
	 */
	public int getLastPage(){
		return totalPages; 
	}
	
	/**
	 * 定义上一页的方法
	* @Title: getPreviousPage 
	* @param @return
	* @return int
	* @throws
	 */
	public int getPreviousPage(){
		return totalPages - 1 < 1 ? 1 : currentPage - 1; 
	}
	/**
	 * 定义下一页的方法
	* @Title: getNextPage 
	* @Description: TODO
	* @param @return
	* @return int
	* @throws
	 */
	public int getNextPage(){
		return currentPage + 1 > totalPages ? totalPages : currentPage + 1;
	}

	@Override
	public String toString() {
		return "PageBean [totalRows=" + totalRows + ", totalPages=" + totalPages + ", currentPage=" + currentPage
				+ ", pageSize=" + pageSize + ", list=" + list + "]";
	}
	
}
