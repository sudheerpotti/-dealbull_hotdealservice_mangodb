package com.dealbab.model;

public class Category {
		private String cid;
	    private String catName;
	    private String catType;
		public String getCid() {
			return cid;
		}
		public void setCid(String cid) {
			this.cid = cid;
		}
		public String getCatName() {
			return catName;
		}
		public void setCatName(String catName) {
			this.catName = catName;
		}
		public String getCatType() {
			return catType;
		}
		public void setCatType(String catType) {
			this.catType = catType;
		}
		@Override
		public String toString() {
			return "Category [cid=" + cid + ", catName=" + catName + ", catType=" + catType + "]";
		}
		
}