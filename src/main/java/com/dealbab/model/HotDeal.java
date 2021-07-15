package com.dealbab.model;


import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "HotDeal")
public class HotDeal {

private Integer id;
private String productTitle;
private String productShortDesc;
private String productModel;
private String currencyCode;
private String publishedDate;
private String basePrice;
private String discountPrice;
private String discountPercentage;
private String quantity;
private String vaildFrom;
private String vaildUntil;
private String stroreId;
private String storeRedirectUrl;
private List<Category> categories ;
private List<String> region = null;
private List<String> size = null;
private List<String> colour=null;
private String productImageURl;
private String rating;
private String storeName;

public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getProductTitle() {
	return productTitle;
}
public void setProductTitle(String productTitle) {
	this.productTitle = productTitle;
}
public String getProductShortDesc() {
	return productShortDesc;
}
public void setProductShortDesc(String productShortDesc) {
	this.productShortDesc = productShortDesc;
}
public String getProductModel() {
	return productModel;
}
public void setProductModel(String productModel) {
	this.productModel = productModel;
}
public String getCurrencyCode() {
	return currencyCode;
}
public void setCurrencyCode(String currencyCode) {
	this.currencyCode = currencyCode;
}
public String getPublishedDate() {
	return publishedDate;
}
public void setPublishedDate(String publishedDate) {
	this.publishedDate = publishedDate;
}
public String getBasePrice() {
	return basePrice;
}
public void setBasePrice(String basePrice) {
	this.basePrice = basePrice;
}
public String getDiscountPrice() {
	return discountPrice;
}
public void setDiscountPrice(String discountPrice) {
	this.discountPrice = discountPrice;
}
public String getDiscountPercentage() {
	return discountPercentage;
}
public void setDiscountPercentage(String discountPercentage) {
	this.discountPercentage = discountPercentage;
}
public String getQuantity() {
	return quantity;
}
public void setQuantity(String quantity) {
	this.quantity = quantity;
}
public String getVaildFrom() {
	return vaildFrom;
}
public void setVaildFrom(String vaildFrom) {
	this.vaildFrom = vaildFrom;
}
public String getVaildUntil() {
	return vaildUntil;
}
public void setVaildUntil(String vaildUntil) {
	this.vaildUntil = vaildUntil;
}
public String getStroreId() {
	return stroreId;
}
public void setStroreId(String stroreId) {
	this.stroreId = stroreId;
}
public String getStoreRedirectUrl() {
	return storeRedirectUrl;
}
public void setStoreRedirectUrl(String storeRedirectUrl) {
	this.storeRedirectUrl = storeRedirectUrl;
}
public List<Category> getCategories() {
	return categories;
}
public void setCategories(List<Category> categories) {
	this.categories = categories;
}
public List<String> getRegion() {
	return region;
}
public void setRegion(List<String> region) {
	this.region = region;
}
public List<String> getSize() {
	return size;
}
public void setSize(List<String> size) {
	this.size = size;
}
public List<String> getColour() {
	return colour;
}
public void setColour(List<String> colour) {
	this.colour = colour;
}
public String getProductImageURl() {
	return productImageURl;
}
public void setProductImageURl(String productImageURl) {
	this.productImageURl = productImageURl;
}
public String getRating() {
	return rating;
}
public void setRating(String rating) {
	this.rating = rating;
}
public String getStoreName() {
	return storeName;
}
public void setStoreName(String storeName) {
	this.storeName = storeName;
}
@Override
public String toString() {
	return "HotDeal [id=" + id + ", productTitle=" + productTitle + ", productShortDesc=" + productShortDesc
			+ ", productModel=" + productModel + ", currencyCode=" + currencyCode + ", publishedDate=" + publishedDate
			+ ", basePrice=" + basePrice + ", discountPrice=" + discountPrice + ", discountPercentage="
			+ discountPercentage + ", quantity=" + quantity + ", vaildFrom=" + vaildFrom + ", vaildUntil=" + vaildUntil
			+ ", stroreId=" + stroreId + ", storeRedirectUrl=" + storeRedirectUrl + ", categories=" + categories
			+ ", region=" + region + ", size=" + size + ", colour=" + colour + ", productImageURl=" + productImageURl
			+ ", rating=" + rating + ", storeName=" + storeName + "]";
}




}