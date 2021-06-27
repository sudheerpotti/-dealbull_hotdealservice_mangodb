package com.dealbab.model;

import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "HotDeal")
public class HotDeal {


private Integer id;
private Products products;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public Products getProducts() {
	return products;
}
public void setProducts(Products products) {
	this.products = products;
}
@Override
public String toString() {
	return "HotDeal [id=" + id + ", products=" + products + "]";
}

}