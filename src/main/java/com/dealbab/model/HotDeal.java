package com.dealbab.model;

<<<<<<< HEAD
=======
import java.util.List;

>>>>>>> beab7bf (first commit)
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "HotDeal")
public class HotDeal {

<<<<<<< HEAD

private Integer id;
private Products products;
public Integer getId() {
=======
private Integer id;
private String productTitle;
private String productShortDesc;
private String productLongDesc;
private String productModel;
private String currencyCode;
private String sku;
private String rating;
private String createdDate;
private String updatedDate;
private String publishedDate;
private String basePrice;
private String discountPrice;
private String discountPercentage;
private String quantity;
private String vaildFrom;
private String vaildUntil;
private String createdBy;
private String updatedBy;
private String sid;
private String oid;
private String storeName;
private String storeImageUrl;
private String storeRedirectUrl;
private List<Variant> variant;
private List<Category> categories ;
private List<String> region = null;
public 	Integer getId() {
>>>>>>> beab7bf (first commit)
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
<<<<<<< HEAD
public Products getProducts() {
	return products;
}
public void setProducts(Products products) {
	this.products = products;
}
@Override
public String toString() {
	return "HotDeal [id=" + id + ", products=" + products + "]";
=======
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
public String getProductLongDesc() {
	return productLongDesc;
}
public void setProductLongDesc(String productLongDesc) {
	this.productLongDesc = productLongDesc;
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
public String getSku() {
	return sku;
}
public void setSku(String sku) {
	this.sku = sku;
}
public String getRating() {
	return rating;
}
public void setRating(String rating) {
	this.rating = rating;
}
public String getCreatedDate() {
	return createdDate;
}
public void setCreatedDate(String createdDate) {
	this.createdDate = createdDate;
}
public String getUpdatedDate() {
	return updatedDate;
}
public void setUpdatedDate(String updatedDate) {
	this.updatedDate = updatedDate;
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
public String getCreatedBy() {
	return createdBy;
}
public void setCreatedBy(String createdBy) {
	this.createdBy = createdBy;
}
public String getUpdatedBy() {
	return updatedBy;
}
public void setUpdatedBy(String updatedBy) {
	this.updatedBy = updatedBy;
}
public String getSid() {
	return sid;
}
public void setSid(String sid) {
	this.sid = sid;
}
public String getOid() {
	return oid;
}
public void setOid(String oid) {
	this.oid = oid;
}
public String getStoreName() {
	return storeName;
}
public void setStoreName(String storeName) {
	this.storeName = storeName;
}
public String getStoreImageUrl() {
	return storeImageUrl;
}
public void setStoreImageUrl(String storeImageUrl) {
	this.storeImageUrl = storeImageUrl;
}
public String getStoreRedirectUrl() {
	return storeRedirectUrl;
}
public void setStoreRedirectUrl(String storeRedirectUrl) {
	this.storeRedirectUrl = storeRedirectUrl;
}
public List<Variant> getVariant() {
	return variant;
}
public void setVariant(List<Variant> variant) {
	this.variant = variant;
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
@Override
public String toString() {
	return "Product [id=" + id + ", productTitle=" + productTitle + ", productShortDesc=" + productShortDesc
			+ ", productLongDesc=" + productLongDesc + ", productModel=" + productModel + ", currencyCode="
			+ currencyCode + ", sku=" + sku + ", rating=" + rating + ", createdDate=" + createdDate
			+ ", updatedDate=" + updatedDate + ", publishedDate=" + publishedDate + ", basePrice=" + basePrice
			+ ", discountPrice=" + discountPrice + ", discountPercentage=" + discountPercentage + ", quantity="
			+ quantity + ", vaildFrom=" + vaildFrom + ", vaildUntil=" + vaildUntil + ", createdBy=" + createdBy
			+ ", updatedBy=" + updatedBy + ", sid=" + sid + ", oid=" + oid + ", storeName=" + storeName
			+ ", storeImageUrl=" + storeImageUrl + ", storeRedirectUrl=" + storeRedirectUrl + ", variant=" + variant
			+ ", categories=" + categories + ", region=" + region + "]";
>>>>>>> beab7bf (first commit)
}

}