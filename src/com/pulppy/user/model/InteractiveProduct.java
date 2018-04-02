package com.pulppy.user.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.pulppy.user.bean.ProductDTO;
import com.pulppy.user.connection.MySQLConnUtils;
import com.pulppy.user.template.TemplateFunction;

public class InteractiveProduct {
	
	/*
	 * Function Name : create Product 
	 * Describe : Insert Music 
	 * Return: true
	 */
	public boolean createProduct(ProductDTO product) throws ClassNotFoundException, SQLException {
		boolean result = false;
		result = insertProduct(product);
		return result;
	}
	
	/*
	 * Function Name : insertAccount 
	 * Describe : Check Duplicate ID and Insert
	 * Return Value: String
	 */
	private boolean insertProduct(ProductDTO product)
			throws ClassNotFoundException, SQLException {
		if (product.getProductName() != null && !product.getProductName().isEmpty() &&
			product.getProductImage() != null && !product.getProductImage().isEmpty() &&
			product.getProductCatelogy() != null && !product.getProductCatelogy().isEmpty() &&
			product.getProductStore() != null && !product.getProductStore().isEmpty() &&
			product.getProductBrand() != null && !product.getProductBrand().isEmpty() &&
			product.getProductShortDecription() != null && !product.getProductShortDecription().isEmpty()) {
			// Query Duplicate ID
			String idGenerate = TemplateFunction.generateRandom();
			if (TemplateFunction.checkDuplicateID(idGenerate, "pProduct") == false) {
				String sql = "Insert into pProduct(id, productName, productImage, productCatelogy, productStore,"
						+ " productPriceDefault, productBrand, productShortDecription, productAmount, productEventStatus, productRate"
						+ ") values(?,?,?,?,?,?,?,?,?,?,?)";
				MySQLConnUtils sqlconn = new MySQLConnUtils();
				Connection conn = sqlconn.getMySQLConnection();
				PreparedStatement pstm = conn.prepareStatement(sql);
				pstm.setString(1, idGenerate);
				pstm.setString(2, product.getProductName());
				pstm.setString(3, product.getProductImage());
				pstm.setString(4, product.getProductCatelogy());
				pstm.setString(5, product.getProductStore());
				pstm.setInt(6, product.getProductPriceDefault());
				pstm.setString(7, product.getProductBrand());
				pstm.setString(8, product.getProductShortDecription());
				pstm.setInt(9, product.getProductAmount());
				pstm.setBoolean(10, product.isProductEventStatus());
				pstm.setInt(11, product.getProductRate());

				pstm.executeUpdate();
				conn.close();
				pstm.close();
				return true;
			}
		}
		return false;
	}
	
	/*
	 * Function Name : Update Product 
	 * Describe : Update Production
	 * Return Value: true
	 */
	public boolean updateProduct(ProductDTO product)
			throws ClassNotFoundException, SQLException, ParseException {
		if (product != null) {
			// Query Duplicate ID
			String sql = "Update pProduct set productName=?, productImage=?, productCatelogy=?,"
					+ " productPriceDefault=?, productBrand=?, productShortDecription=?,"
					+ " productAmount=?, productEventStatus=?, productEventStart=?,"
					+ " productEventEnd=?,productPriceEvent=?"
					+ " where id =?";
			
			
			MySQLConnUtils sqlconn = new MySQLConnUtils();
			Connection conn = sqlconn.getMySQLConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, product.getProductName());
			pstm.setString(2, product.getProductImage());
			pstm.setString(3, product.getProductCatelogy());
			pstm.setInt(4, product.getProductPriceDefault());
			pstm.setString(5, product.getProductBrand());
			pstm.setString(6, product.getProductShortDecription());
			pstm.setInt(7, product.getProductAmount());
			
			// Checking Event Status for Update Event
			if(product.isProductEventStatus() == true ){
				Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(product.getProductEventStart());  
			    Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(product.getProductEventEnd()); 
			    // Checking Date Event Valid
			    if(date2.compareTo(date1) >= 0){			    	
			    	pstm.setBoolean(8, product.isProductEventStatus());	
					pstm.setString(9, product.getProductEventStart());
					pstm.setString(10, product.getProductEventEnd());
					// Checking Event price Limit
					if(product.getProductPriceEvent() >= 10000){
						pstm.setInt(11, product.getProductPriceEvent());
					}else{
						System.out.println("Gia Khong Dat Yeu Cau");
						return false;
					}
			    }else{
			    	System.out.println("Date input False");
			    	return false;
			    }
				
			}
			pstm.setString(12,product.getProductID());
			
			pstm.executeUpdate();
			conn.close();
			pstm.close();
			return true;
			
		}
		System.out.println("Choose Product");
		return false;
	}
	
}
