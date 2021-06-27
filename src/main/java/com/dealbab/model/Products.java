package com.dealbab.model;

import java.util.List;

public class Products {


private String productTitle;
private String shortDesc;
private String storeName;
private String storeImgUrl;
private List<Variant> variant = null;
private List<Cateogory> cateogory = null;
public String getProductTitle() {
	return productTitle;
}
public void setProductTitle(String productTitle) {
	this.productTitle = productTitle;
}
public String getShortDesc() {
	return shortDesc;
}
public void setShortDesc(String shortDesc) {
	this.shortDesc = shortDesc;
}
public String getStoreName() {
	return storeName;
}
public void setStoreName(String storeName) {
	this.storeName = storeName;
}
public String getStoreImgUrl() {
	return storeImgUrl;
}
public void setStoreImgUrl(String storeImgUrl) {
	this.storeImgUrl = storeImgUrl;
}
public List<Variant> getVariant() {
	return variant;
}
public void setVariant(List<Variant> variant) {
	this.variant = variant;
}
public List<Cateogory> getCateogory() {
	return cateogory;
}
public void setCateogory(List<Cateogory> cateogory) {
	this.cateogory = cateogory;
}
@Override
public String toString() {
	return "Products [productTitle=" + productTitle + ", shortDesc=" + shortDesc + ", storeName=" + storeName
			+ ", storeImgUrl=" + storeImgUrl + ", variant=" + variant + ", cateogory=" + cateogory + "]";
}


}
