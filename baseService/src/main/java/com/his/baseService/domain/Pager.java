package com.his.baseService.domain;

import java.util.List;

public class Pager {
      private int total;
      private List<? extends Object> xms;
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public List<? extends Object> getRows() {
		return xms;
	}
	public void setRows(List<? extends Object> rows) {
		this.xms = rows;
	}
	public Pager(int total, List<? extends Object> rows) {
		super();
		this.total = total;
		this.xms = rows;
	}
	public Pager() {
		super();
		// TODO Auto-generated constructor stub
	}
      
}
