package com.pulppy.user.actionTest;

import java.sql.SQLException;
import java.text.ParseException;

import com.pulppy.user.bean.ProductDTO;
import com.pulppy.user.model.InteractiveProduct;

public class ProductDATA {
	
	/* DTO Data Test */
	public static ProductDTO setProductDTO(){
		ProductDTO dto = new ProductDTO();
		dto.setProductName("Galaxy Note 8");
		dto.setProductImage("None");
		dto.setProductCatelogy("Mobile");
		dto.setProductStore("Samsung Center");
		dto.setProductPriceDefault(22000000);
		dto.setProductBrand("Samsung");
		dto.setProductShortDecription("This is Samsung Note 8");
		dto.setProductAmount(200);
		dto.setProductEventStatus(true);
		dto.setProductRate(5);
		dto.setProductEventStatus(true);
		dto.setProductPriceEvent(200001);
		dto.setProductEventStart("12/02/2012");
		dto.setProductEventEnd("13/02/2012");
		dto.setProductID("4XGPDMGR23O4ZEQUJ");
		dto.setProductActive(true);
		return dto;
	}
}
