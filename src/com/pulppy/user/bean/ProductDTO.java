package com.pulppy.user.bean;

import java.util.Date;

public class ProductDTO {
	private String productID;
	private String productName;
	private String productImage;
	private String productCatelogy;
	private String productStore;
	private int productPriceDefault;
	private String productBrand;
	private String productShortDecription;
	private String productDecription;
	private int productAmount;
	private String productCustomer;
	private String productDetailDecription;
	private String productComment;
	private boolean productEventStatus;
	private String productEventStart;
	private String productEventEnd;
	private int productPriceEvent;
	private int productRate;
	private boolean productActive;

	public ProductDTO(String productID, String productName, String productImage, String productCatelogy,
			String productStore, int productPriceDefault, String productBrand, String productShortDecription,
			String productDecription, int productAmount, String productCustomer, String productDetailDecription,
			String productComment, boolean productEventStatus, String productEventStart, String productEventEnd,
			int productPriceEvent, int productRate, boolean productActive) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.productImage = productImage;
		this.productCatelogy = productCatelogy;
		this.productStore = productStore;
		this.productPriceDefault = productPriceDefault;
		this.productBrand = productBrand;
		this.productShortDecription = productShortDecription;
		this.productDecription = productDecription;
		this.productAmount = productAmount;
		this.productCustomer = productCustomer;
		this.productDetailDecription = productDetailDecription;
		this.productComment = productComment;
		this.productEventStatus = productEventStatus;
		this.productEventStart = productEventStart;
		this.productEventEnd = productEventEnd;
		this.productPriceEvent = productPriceEvent;
		this.productRate = productRate;
		this.productActive = productActive;
	}

	public ProductDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductImage() {
		return productImage;
	}

	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}

	public String getProductCatelogy() {
		return productCatelogy;
	}

	public void setProductCatelogy(String productCatelogy) {
		this.productCatelogy = productCatelogy;
	}

	public String getProductStore() {
		return productStore;
	}

	public void setProductStore(String productStore) {
		this.productStore = productStore;
	}

	public int getProductPriceDefault() {
		return productPriceDefault;
	}

	public void setProductPriceDefault(int productPriceDefault) {
		this.productPriceDefault = productPriceDefault;
	}

	public String getProductBrand() {
		return productBrand;
	}

	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}

	public String getProductShortDecription() {
		return productShortDecription;
	}

	public void setProductShortDecription(String productShortDecription) {
		this.productShortDecription = productShortDecription;
	}

	public String getProductDecription() {
		return productDecription;
	}

	public void setProductDecription(String productDecription) {
		this.productDecription = productDecription;
	}

	public int getProductAmount() {
		return productAmount;
	}

	public void setProductAmount(int productAmount) {
		this.productAmount = productAmount;
	}

	public String getProductCustomer() {
		return productCustomer;
	}

	public void setProductCustomer(String productCustomer) {
		this.productCustomer = productCustomer;
	}

	public String getProductDetailDecription() {
		return productDetailDecription;
	}

	public void setProductDetailDecription(String productDetailDecription) {
		this.productDetailDecription = productDetailDecription;
	}

	public String getProductComment() {
		return productComment;
	}

	public void setProductComment(String productComment) {
		this.productComment = productComment;
	}

	public boolean isProductEventStatus() {
		return productEventStatus;
	}

	public void setProductEventStatus(boolean productEventStatus) {
		this.productEventStatus = productEventStatus;
	}

	public String getProductEventStart() {
		return productEventStart;
	}

	public void setProductEventStart(String productEventStart) {
		this.productEventStart = productEventStart;
	}

	public String getProductEventEnd() {
		return productEventEnd;
	}

	public void setProductEventEnd(String productEventEnd) {
		this.productEventEnd = productEventEnd;
	}

	public int getProductPriceEvent() {
		return productPriceEvent;
	}

	public void setProductPriceEvent(int productPriceEvent) {
		this.productPriceEvent = productPriceEvent;
	}

	public int getProductRate() {
		return productRate;
	}

	public void setProductRate(int productRate) {
		this.productRate = productRate;
	}

	public boolean isProductActive() {
		return productActive;
	}

	public void setProductActive(boolean productActive) {
		this.productActive = productActive;
	}

}
