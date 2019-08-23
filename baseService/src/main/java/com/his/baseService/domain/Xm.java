package com.his.baseService.domain;

public class Xm {
		private Integer xmbh;
		private String xmmc;
		private String zjm;
		private Integer dj;
		public Integer getXmbh() {
			return xmbh;
		}
		public void setXmbh(Integer xmbh) {
			this.xmbh = xmbh;
		}
		public String getXmmc() {
			return xmmc;
		}
		public void setXmmc(String xmmc) {
			this.xmmc = xmmc;
		}
		public String getZjm() {
			return zjm;
		}
		public void setZjm(String zjm) {
			this.zjm = zjm;
		}
		public Integer getDj() {
			return dj;
		}
		public void setDj(Integer dj) {
			this.dj = dj;
		}
		public Xm(Integer xmbh, String xmmc, String zjm, Integer dj) {
			super();
			this.xmbh = xmbh;
			this.xmmc = xmmc;
			this.zjm = zjm;
			this.dj = dj;
		}
		public Xm() {
			super();
			// TODO Auto-generated constructor stub
		}
		
}
