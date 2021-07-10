package com.dealbab.model;

public class Variant {
<<<<<<< HEAD
private String type;
private String name;
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Variant [type=" + type + ", name=" + name + "]";
}

}
=======
private String vid;
private String variantType;
private String variantName;
public String getVid() {
	return vid;
}
public void setVid(String vid) {
	this.vid = vid;
}
public String getVariantType() {
	return variantType;
}
public void setVariantType(String variantType) {
	this.variantType = variantType;
}
public String getVariantName() {
	return variantName;
}
public void setVariantName(String variantName) {
	this.variantName = variantName;
}
@Override
public String toString() {
	return "Variant [vid=" + vid + ", variantType=" + variantType + ", variantName=" + variantName + "]";
}


}
>>>>>>> beab7bf (first commit)
